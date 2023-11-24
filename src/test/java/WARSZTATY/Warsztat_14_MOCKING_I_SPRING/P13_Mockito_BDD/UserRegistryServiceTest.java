package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P13_Mockito_BDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserRegistryServiceTest {

    @InjectMocks
    private UserRegistryService userRegistryService;

    @Mock
    private UsersRepository usersRepository;

    @Test
    @DisplayName("Adding users to the repository works successfully")
    void test1() {

        //given
        final var user = User.builder()
                .name("Roman")
                .surname("Adamski")
                .phone("12345")
                .build();

        BDDMockito.given(usersRepository.contains(user.getPhone())).willReturn(false);

        //when
        userRegistryService.register(user);

        //then
        BDDMockito.then(usersRepository)
                .should()
                .put(user);
    }

    @Test
    @DisplayName("Adding users with the same phone numbers twice fails")
    void test2() {

        //given
        var user = User.builder()
                .name("Karol")
                .surname("Rogowski")
                .phone("987654")
                .build();
        BDDMockito.given(usersRepository.contains(user.getPhone())).willReturn(true);

        // when
        try {
            userRegistryService.register(user);
            // ta linijka poniżej i metoda .fail służy tylko po to, żeby test sfeilował/zakończył się niepowodzeniem,
            //  bo nie powinien tu przejść, ponieważ powyższa linijka powinna zakończyć się rzuceniem wyjątku.
            Assertions.fail("Should throw exception");
        } catch (RuntimeException ignore) {
        } // ignore służy do ignorowania wyjątku

        // then
        BDDMockito.then(usersRepository)
                .should(Mockito.never())
                .put(user);
    }

    @Test
    @DisplayName("Adding users with too long phone number fails")
    void test3() {

        //given
        final var user = User.builder()
                .name("Roman")
                .surname("Adamski")
                .phone("123456789345")
                .build();

        BDDMockito.given(usersRepository.contains(user.getPhone())).willReturn(false);
        BDDMockito.willThrow(new RuntimeException("Phone number is to long"))
                .given(usersRepository)
                .put(user);
        // when

        try {
            userRegistryService.register(user);
            Assertions.fail("Should throw exception");
        } catch (Exception ignore) {
        }

        // then
        BDDMockito.then(usersRepository)
                .should()
                .put(user);
    }


}