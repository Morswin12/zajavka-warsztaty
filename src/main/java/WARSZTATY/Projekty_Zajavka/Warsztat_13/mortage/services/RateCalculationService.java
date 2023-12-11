package WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.services;

import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.InputData;
import WARSZTATY.Projekty_Zajavka.Warsztat_13.mortage.model.Rate;

import java.util.List;

public interface RateCalculationService {

    List<Rate> calculate(InputData inputData);
}
