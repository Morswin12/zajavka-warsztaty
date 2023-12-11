package WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.Installment;
import WARSZTATY.Projekty_Zajavka.Warsztat_14.mortgage.model.Summary;

import java.util.List;

public interface SummaryService {

    Summary calculateSummary(List<Installment> installments);
}
