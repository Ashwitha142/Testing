package test.cal.FizzBizz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DivisibleTest {

    @Test
    void shouldReturnFizzBizzTest() {
        assertEquals("FizzBizz", DivisibleNumber.checkNumber(15));
    }

    @Test
    void shouldReturnBizzTest() {
        assertEquals("Bizz", DivisibleNumber.checkNumber(50));
    }

    @Test
    void shouldReturnFizzTest() {
        assertEquals("Fizz", DivisibleNumber.checkNumber(18));
    }

    @Test
    void shouldNotReturnAnyNumber() {
        assertEquals("17", DivisibleNumber.checkNumber(17));
    }
}
