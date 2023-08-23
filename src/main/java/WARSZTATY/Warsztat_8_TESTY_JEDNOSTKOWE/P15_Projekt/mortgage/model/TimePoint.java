package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDate;

@Value
@Builder
@AllArgsConstructor
public class TimePoint {

    BigDecimal year;
    BigDecimal month;
    LocalDate date;

}
