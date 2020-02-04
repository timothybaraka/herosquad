import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void NewHeroGetsCreatedCorrectly_true() throws Exception{
        Hero hero = new Hero("superman", 35, "Laser_eyes");
        assertEquals(true,hero instanceof Hero);
    }

    @Test
    public void Heronamegetscorrectlyadded_true() throws Exception{
        Hero hero = new Hero("superman", 35, "Laser_eyes");
        assertEquals("superman",hero.getName());
    }

    @Test
    public void Heroagecorrectlyadded_35() throws Exception{
        Hero hero = new Hero("superman", 35, "Laser_eyes");
        assertEquals(35,hero.getAge());
    }

    @Test
    public void HeropowerIscorrectlyadded_true() throws Exception{
        Hero hero = new Hero("superman", 35, "Laser_eyes");
        assertEquals("lasereyes",hero.getPower());
    }





}