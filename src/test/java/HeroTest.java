import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void NewHeroGetsCreatedCorrectly_true() throws Exception{
        Hero hero = new Hero("superman", 35, "Laser_eyes");
        assertEquals(true,hero instanceof Hero);
    }
}