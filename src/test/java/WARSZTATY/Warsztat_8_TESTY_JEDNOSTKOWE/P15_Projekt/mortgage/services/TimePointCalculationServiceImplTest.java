package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.services;

import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.InputData;
import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.MortgageType;
import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.Overpayment;
import WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P15_Projekt.mortgage.model.TimePoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

class TimePointCalculationServiceImplTest {

    private TimePointCalculationService timePointCalculationService;

    @BeforeEach
    public void setup() {
        this.timePointCalculationService = new TimePointCalculationServiceImpl();
    }

    @Test
    void calculate() {
        // given
        InputData inputData = someInputData();
        TimePoint timePoint = TimePoint.builder()
                .month(BigDecimal.TEN)
                .year(BigDecimal.valueOf(2010))
                .date(LocalDate.of(2010, 10, 5))
                .build();

        // when
        TimePoint result = timePointCalculationService.calculate(BigDecimal.valueOf(15), inputData);

        // then
        Assertions.assertEquals(timePoint, result);
    }

    @Test
    void testCalculate() {
    }

    public InputData someInputData() {
        return InputData.builder()
                .repaymentStartDate(LocalDate.of(2010, 5, 10))
                .wiborPercent(BigDecimal.valueOf(2.70))
                .amount(BigDecimal.valueOf(301923.46))
                .monthsDuration(BigDecimal.valueOf(180))
                .rateType(MortgageType.CONSTANT)
                .marginPercent(BigDecimal.valueOf(1.8))
                .overpaymentProvisionPercent(BigDecimal.valueOf(3))
                .overpaymentProvisionMonths(BigDecimal.valueOf(36))
                .overpaymentStartMonth(BigDecimal.valueOf(1))
//                .overpaymentSchema(Map.of(
//                        2, BigDecimal.valueOf(10000),
//                        3, BigDecimal.valueOf(10000),
//                        5, BigDecimal.valueOf(10000),
//                        6, BigDecimal.valueOf(10000),
//                        7, BigDecimal.valueOf(10000))
//                )
                .overpaymentReduceWay(Overpayment.REDUCE_PERIOD)
                .mortgagePrintPayoffsSchedule(true)
                .mortgageRateNumberToPrint(1)
                .build();
    }
}