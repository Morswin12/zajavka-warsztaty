package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortgage.model.Rate;

import java.util.List;

public interface RateCalculationService {

    List<Rate> calculate(InputData inputData);
}
