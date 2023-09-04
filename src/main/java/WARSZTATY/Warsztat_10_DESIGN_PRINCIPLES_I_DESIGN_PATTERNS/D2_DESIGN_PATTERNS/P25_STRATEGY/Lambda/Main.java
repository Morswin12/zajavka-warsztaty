package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P25_STRATEGY.Lambda;

public class Main {
    public static void main(String[] args) {
        OnlineStore onlineStore = new OnlineStore();

        onlineStore.addParcel(new Parcel("Skarpety"));
        onlineStore.addParcel(new Parcel("mleko"));
        onlineStore.addParcel(new Parcel("świder"));
        System.out.println();

        System.out.println("##Courier");
        onlineStore.deliver(parcel -> System.out.printf("Parcel %s delivered by Courier%n", parcel.getName()));
        System.out.println();

        System.out.println("##Parcel Locker");
        onlineStore.deliver(parcel -> System.out.printf("Parcel %s delivered by ParcelLocker%n", parcel.getName()));
        System.out.println();

        System.out.println("##Post");
        onlineStore.deliver(parcel -> System.out.printf("Parcel %s delivered by Post%n", parcel.getName()));

        // LAMBDA


    }
}
