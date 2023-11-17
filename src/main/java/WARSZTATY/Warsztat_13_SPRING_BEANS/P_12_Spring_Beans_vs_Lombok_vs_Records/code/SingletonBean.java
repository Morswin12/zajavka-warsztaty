package WARSZTATY.Warsztat_13_SPRING_BEANS.P_12_Spring_Beans_vs_Lombok_vs_Records.code;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
//@AllArgsConstructor(onConstructor = @__(@Autowired)) // jeśli mamy więcej konstruktorów możemy zapisać tak
//@RequiredArgsConstructor - jeśli pole jest final przy PrototypeBean12
public class SingletonBean {

    private PrototypeBean12 prototypeBean;
}
