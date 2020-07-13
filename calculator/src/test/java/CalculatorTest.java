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
    public void canAddTwoNumbers(){
        assertEquals(5, calculator.addTwoNumbers(1,4));
    }

    @Test
    public void canSubtractTwoNumbers(){
        assertEquals(7, calculator.subtractTwoNumbers(9,2));
    }

    @Test
    public void canMultiplyTwoNumbers(){
        assertEquals(12, calculator.multiplyTwoNumbers(3,4));
    }
    @Test
    public void canDivideTwoNumbers(){
        assertEquals(3, calculator.divideTwoNumbers(6,2),1);
    }

}
