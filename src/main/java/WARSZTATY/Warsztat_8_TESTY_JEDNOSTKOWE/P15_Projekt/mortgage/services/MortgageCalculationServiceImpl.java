package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.services;

import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.InputData;
import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.Rate;
import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.Summary;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class MortgageCalculationServiceImpl implements MortgageCalculationService {

    private final RateCalculationService rateCalculationService;

    private final PrintingService printingService;

    private final SummaryService summaryService;

    @Override
    public void calculate(InputData inputData) {
        printingService.printIntroInformation(inputData);

        List<Rate> rates = rateCalculationService.calculate(inputData);
        rates.forEach(element -> log.debug("Rate: [{}]", element));
        Summary summary = summaryService.calculateSummary(rates);

        printingService.printSummary(summary);
        printingService.printSchedule(rates, inputData);
    }

}
