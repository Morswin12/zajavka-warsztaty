package WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.model;

import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDate;

@Value
public class TimePoint {

    BigDecimal year;

    BigDecimal month;

    LocalDate date;
}
