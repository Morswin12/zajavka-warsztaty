package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P21_BRIDGE;

public class Main {
    public static void main(String[] args) {
    //Bridge - czy 2 abstrakcyjne twory ?

        Shape shape1 = new Square(new Red());
        System.out.println(shape1);

        Shape shape2 = new Triangle(new Green());
        System.out.println(shape2);
    }
}
