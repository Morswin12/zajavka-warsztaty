package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.P4_Design_Principles_SOLID;

public class Main2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Square(10);
        rectangle.setA(2);
        rectangle.setB(4);
        System.out.println(rectangle.area());

    }
}
