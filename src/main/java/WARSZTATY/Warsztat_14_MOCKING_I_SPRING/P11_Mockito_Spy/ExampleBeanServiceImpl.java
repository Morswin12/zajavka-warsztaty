package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P11_Mockito_Spy;

import java.util.ArrayList;
import java.util.List;

public class ExampleBeanServiceImpl implements ExampleBeanService{

    private List<String> sampleList = new ArrayList<>();

    @Override
    public void sampleMethod(String... valuesToAdd) {
        for (String s : valuesToAdd) {
            sampleList.add(s);
        }
    }
}
