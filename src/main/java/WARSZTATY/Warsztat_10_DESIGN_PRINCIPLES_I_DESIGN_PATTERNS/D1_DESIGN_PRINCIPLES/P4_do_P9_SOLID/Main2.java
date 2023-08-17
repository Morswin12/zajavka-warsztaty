package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D1_DESIGN_PRINCIPLES.P4_do_P9_SOLID;

public class Main2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Square(10);
        rectangle.setA(2);
        rectangle.setB(4);
        System.out.println(rectangle.area());

    }
}
