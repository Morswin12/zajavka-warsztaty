package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.Rate;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.Summary;

import java.util.List;

@FunctionalInterface
public interface SummaryService {

    Summary calculateSummary(List<Rate> rates);
}
