package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.P4_Design_Principles_SOLID;

public class Square extends Rectangle{

    public Square(double a) {
        super(a, a);
    }

    @Override
    public void setB(double b) {
        this.a = b;
        this.b = b;
    }

    @Override
    public double area() {
        return super.area();
    }
}
