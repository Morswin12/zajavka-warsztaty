package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P25_STRATEGY.Traditional;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {

    private List<Parcel> parcels = new ArrayList<>();

    public void addParcel(final Parcel parcel) {
        parcels.add(parcel);
    }

    public void deliver(DeliveryStrategy deliveryStrategy) {
        for (Parcel parcel : parcels) {
            deliveryStrategy.deliver(parcel);
        }
    }
}
