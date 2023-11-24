package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P13_Mockito_BDD;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value
@Builder
public class User {

    // BDD -> (Behaviour Driven Development) Jest tak metodologią tworzenia oprogramowania, takim podejściem do
    //          tworzenia oprogramowania, w którym aplikacja jest dokumentowana i zaprojektowana z myślą o zachowaniach,
    //          które użytkownik wykonuje podczas interakcji z tą aplikacją i to podejście BDD zaleca nam pisanie
    //          testów w taki sposób, żeby ono było pisane językiem naturalnym, który jest czytelny dla człowieka i
    //          jednocześnie ten test ma koncentrować się na zachowaniu aplikacji, czyli reasumując w podejściu BDD
    //          piszemy testy w języku naturalnym. Rozszerza TDD, gdzie TDD skupia się bardziej na technikaliach, a BDD
    //          na aspektach życiowych/funkcjonalnych;
    // Można wyróżnić niejako 3 sekcie w pisaniu testów:
    //      1. Arrange (given) -> założenie warunków początkowych
    //      2. Act (when) -> kiedy wystąpi jakaś akcja
    //      3. Assert (then) -> weryfikacja danych wyjściowych

    String name;
    String surname;
    String phone;

    public boolean isValid() {
        return Objects.nonNull(name)
        && Objects.nonNull(surname)
        && Objects.nonNull(phone);
    }
}
