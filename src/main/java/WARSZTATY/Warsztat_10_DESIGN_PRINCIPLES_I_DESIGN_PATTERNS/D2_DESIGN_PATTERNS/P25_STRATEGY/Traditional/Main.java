package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P25_STRATEGY.Traditional;

public class Main {
    public static void main(String[] args) {
        /* Strategy lub Policy Pattern -> gdy chcemy, aby klient miał możliwość wyboru strategii, jaka będzie w środku
                                np. wybór implementacji sortowania w metodzie sort() w Collections, czyli jest to taki
                                wybór tego, jak coś będzie zachowywać się w środku i mamy możliwość decydowania o tym.
                                Np. mam jakiś sklep internetowy i musimy dostarczyć paczkę, i to klient decyduje, w
                                jaki sposób ją dostarczyć.
        Collections.sort();
*/

        OnlineStore onlineStore = new OnlineStore();

        onlineStore.addParcel(new Parcel("Skarpety"));
        onlineStore.addParcel(new Parcel("mleko"));
        onlineStore.addParcel(new Parcel("monitory"));
        System.out.println();

        System.out.println("##Courier");
        onlineStore.deliver(new CourierStrategy());
        System.out.println();

        System.out.println("##Parcel Locker");
        onlineStore.deliver(new ParcelLockerStrategy());
        System.out.println();

        System.out.println("##Post");
        onlineStore.deliver(new PostStrategy());

        // LAMBDA


    }
}
