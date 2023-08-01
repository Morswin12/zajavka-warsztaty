package WARSZTATY.Warsztat_6_LOMBOCK.P4_;

import lombok.*;

import java.util.List;

@Value
public class Owner {
     String name;

     @NonNull Integer age;

    List<String> favouriteFood;
}
