package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P11_Testy;

public class Student extends Person{
    public static <P extends Person> void print(P p) {
        System.out.println(p.getName());
    }

    public static void main(String[] args) {
        Student.print(new Person());
        Student.print(new Student());
        Student.<Person>print(new Student());
//        Student.<Student>print(new Person());
        Student.<Student>print(new Student());
//        Student.<String>print(new Student());
    }
}
