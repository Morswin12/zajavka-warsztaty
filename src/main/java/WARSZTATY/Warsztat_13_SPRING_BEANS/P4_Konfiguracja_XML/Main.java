package WARSZTATY.Warsztat_13_SPRING_BEANS.P4_Konfiguracja_XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    /*
        Konfiguracja Jawna
            -> pliki XML
            -> oparta o Javę
    */
    /*
        Konfiguracja automatyczna (niejawna)
            -> Adnotacje
     */
    public static void main(String[] args) {
        // "applicationContext_Goro.xml" to nazwa pliku który utworzyliśmy w resources
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_Goro.xml");

        System.out.println("goro: Context created");
        // nazwa "exampleBean" musi być taka sama jak w pliku który mamy w "resources" w <bean id = "exampleBean" ...>
        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        exampleBean.exampleMethod();

        ExampleBean2_InjectedBySet exampleBean2InjectedBySet = context.getBean(
                "exampleBean2",
                ExampleBean2_InjectedBySet.class
        );
        exampleBean2InjectedBySet.exampleMethod22();
    }


}
