package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P23_IO__in_out_Serialization_Deserialization_cz_2;

import java.io.Serializable;

public class Dog implements Serializable {
    private static final long serialVersionUID = 1L;
    private transient String name = "fieldName";
    private String nickName = "fieldNickName";
    static int age = 10;

    {
        this.name = "defaultName";
        this.nickName = "defaultNickName";
        System.out.println("Calling init block");
            }

    static {
        age = 100;
        System.out.println("Calling static init block");
    }

    public Dog() {
        this.name = "ConstructorDefaultName";
        this.nickName = "ConstructorDefaultNickName";
        System.out.println("Calling default constrictor");
    }

    public Dog(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
        System.out.println("Calling normal constrictor");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
