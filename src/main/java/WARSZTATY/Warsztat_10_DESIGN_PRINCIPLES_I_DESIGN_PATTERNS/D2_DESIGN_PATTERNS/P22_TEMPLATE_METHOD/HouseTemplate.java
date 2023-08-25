package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P22_TEMPLATE_METHOD;

public abstract class HouseTemplate {
    protected final void build() {
        digHole();
        buildFoundation();
        buildWalls();
        makeRoof();
        insertWindows();

    }


    protected void digHole() {
        System.out.println("Digging hole");
    }
    protected abstract void buildFoundation();
    protected abstract void buildWalls();
    protected abstract void makeRoof();
    protected abstract void insertWindows();
}
