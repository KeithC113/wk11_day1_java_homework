import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle (200);
    }
    @Test
    public void hasVolume(){
        assertEquals(200, waterBottle.getVolume());
    }

    @Test
    public void drinkLiquid(){
        assertEquals(190, waterBottle.drinkLiquid(10));
    }

}
