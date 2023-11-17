package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.Rate;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.Summary;

import java.util.List;

@FunctionalInterface
public interface SummaryService {

    Summary calculateSummary(List<Rate> rates);
}
