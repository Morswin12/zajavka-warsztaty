package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P22_TEMPLATE_METHOD;

import lombok.ToString;

@ToString
public class BrickHouse extends HouseTemplate {

    @Override
    protected void buildFoundation() {
        System.out.println("BrickHouse buildFoundation()");
    }

    @Override
    protected void buildWalls() {
        System.out.println("BrickHouse buildWalls()");
    }

    @Override
    protected void makeRoof() {
        System.out.println("BrickHouse makeRoof()");
    }

    @Override
    protected void insertWindows() {
        System.out.println("BrickHouse insertWindows()");
    }

}
