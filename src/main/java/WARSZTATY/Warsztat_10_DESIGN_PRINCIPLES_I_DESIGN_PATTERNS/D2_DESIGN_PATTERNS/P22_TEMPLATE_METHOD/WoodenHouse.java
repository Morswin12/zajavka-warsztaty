package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P22_TEMPLATE_METHOD;

import lombok.ToString;

@ToString
public class WoodenHouse extends HouseTemplate {
    @Override
    protected void buildFoundation() {
        System.out.println("WoodenHouse buildFoundation()");
    }

    @Override
    protected void buildWalls() {
        System.out.println("WoodenHouse buildWalls()");
    }

    @Override
    protected void makeRoof() {
        System.out.println("WoodenHouse makeRoof()");
    }

    @Override
    protected void insertWindows() {
        System.out.println("WoodenHouse insertWindows()");
    }
}
