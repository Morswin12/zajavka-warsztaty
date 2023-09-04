package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P25_STRATEGY.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OnlineStore {

    private List<Parcel> parcels = new ArrayList<>();

    public void addParcel(final Parcel parcel)
    {
        parcels.add(parcel);
    }

    public void deliver(Consumer<Parcel> strategy) {
      parcels.forEach(strategy);}
}
