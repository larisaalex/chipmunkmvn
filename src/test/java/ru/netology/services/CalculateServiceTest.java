package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculateServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,150000",
            "2,100000,60000,150000"
    })
    public void testDaysWeekend(int expected, int income, int expenses, int threshold) {
        CalculateService service = new CalculateService();

        int actual = service.calculate(income, expenses);

        Assertions.assertEquals(expected, actual, threshold);

    }
}
