package test.cal.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
public class CalciTest {
	MathHelp help = mock(MathHelp.class);
	Calci cal = new Calci(help);
    @Test
    void calculateSumTest() {
        when(help.add(8, 8)).thenReturn(16);
        int result = cal.CalculateSum(8, 8);
        assertEquals(16, result);
    }
}