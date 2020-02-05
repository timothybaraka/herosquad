import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void InstantiatesNewSquad_true()throws Exception{
        Squad squad = new Squad(5, "descepticons", "change the world");
        assertEquals(true, squad instanceof Squad);
    }

    @Test
    public void InstantiatesNewSize_5()throws Exception{
        Squad squad = new Squad(5, "descepticons", "change the world");
        assertEquals(5, squad.getSize());
    }

    @Test
    public void InstantiatesNewName_descepticons()throws Exception{
        Squad squad = new Squad(5, "descepticons", "change the world");
        assertEquals("descepticons", squad.getName());
    }

    @Test
    public void InstantiatesNewCause_cause()throws Exception{
        Squad squad = new Squad(5, "descepticons", "change the world");
        assertEquals("change the world", squad.getCause());
    }


}