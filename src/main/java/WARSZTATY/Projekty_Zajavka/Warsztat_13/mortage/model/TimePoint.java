package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public record TimePoint(BigDecimal year, BigDecimal month, LocalDate date) {}
