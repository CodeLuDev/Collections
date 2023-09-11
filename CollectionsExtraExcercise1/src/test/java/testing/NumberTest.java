package testing;

import org.example.service.NumberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberTest {

    @Test
    public void verifyAddNumberToListTest() {

        NumberService numberService = new NumberService();

        int[] numbers = {8,10,50,-25,100,86,-99};
        numberService.addNumberToList(numbers);

        Assertions.assertEquals(6,numberService.getNumbersList().size());

    }

    @Test
    public void verifyNumbersListTest() {

        NumberService numberService = new NumberService();

        int[] numbers = {8,10,50,-25,100,86,-99};
        numberService.addNumberToList(numbers);
        numberService.numbersList(numbers);

        Assertions.assertEquals(6,numberService.getNumbersList().size());

    }

    @Test
    public void verifySumNumbersTest() {

        NumberService numberService = new NumberService();

        int[] numbers = {8,10,50,-25,100,86,-99};

        int resultSum = numberService.sumNumbers(numbers);

        int sumExpected = 229;

        Assertions.assertEquals(sumExpected, resultSum);

    }

    @Test
    public void verifyAverageNumbersTest() {

        NumberService numberService = new NumberService();

        int[] numbers = {8,10,50,-25,100,86,-99};

        double resultAverage = numberService.averageNumbers(numbers);

        int averageExpected = 38;

        Assertions.assertEquals(averageExpected,resultAverage);
    }
}
