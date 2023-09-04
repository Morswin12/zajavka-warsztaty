package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P25_STRATEGY.Traditional;

public class PostStrategy implements DeliveryStrategy{
    @Override
    public void deliver(Parcel parcel) {
        System.out.printf("Parcel %s delivered by Post%n", parcel.getName());
    }
}
