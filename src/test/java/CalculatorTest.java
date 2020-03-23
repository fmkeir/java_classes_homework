import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add4to10is14(){
        assertEquals(14, calculator.add(4,10));
    }

    @Test
    public void subtract9from21is12(){
        assertEquals(12, calculator.subtract(21, 9));
    }

    @Test
    public void multiply4times6is24(){
        assertEquals(24, calculator.multiply(6,4));
    }

    @Test
    public void divide25by5(){
        assertEquals(5, calculator.divide(25,5), 0.01);
    }

    @Test
    public void divide21by2(){
        assertEquals(10.5, calculator.divide(21,2), 0.01);
    }
}
