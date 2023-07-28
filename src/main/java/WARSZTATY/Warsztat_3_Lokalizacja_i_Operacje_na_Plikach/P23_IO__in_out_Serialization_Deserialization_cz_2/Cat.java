package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P23_IO__in_out_Serialization_Deserialization_cz_2;

public class Cat {
    private static final long serialVersionUID = 1L;
    private transient String name = "fieldName";
    private String nickName = "fieldNickName";
    static int age = 10;

    {
        this.name = "CATdefaultName";
        this.nickName = "CATdefaultNickName";
        System.out.println("Calling init block");
    }

    static {
        age = 100;
        System.out.println("Calling static init block");
    }

    public Cat() {
        this.name = "ConstructorCATDefaultName";
        this.nickName = "ConstructorCATDefaultNickName";
        System.out.println("Calling CATdefault constrictor");
    }

    public Cat(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
        System.out.println("Calling normal constrictor");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
