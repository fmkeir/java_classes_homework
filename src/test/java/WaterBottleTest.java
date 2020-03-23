import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle();
    }

    @Test
    public void volumeStartsAt100() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drinkDecrementsVolumeBy10() {
        waterbottle.takeDrink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void drinkCanBeCalledTwiceinSuccession() {
        waterbottle.takeDrink();
        waterbottle.takeDrink();
        assertEquals(80, waterbottle.getVolume());
    }

    @Test
    public void emptySetsVolumeTo0() {
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void fillSetsVolumeTo100() {
        waterbottle.empty();
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }
}
