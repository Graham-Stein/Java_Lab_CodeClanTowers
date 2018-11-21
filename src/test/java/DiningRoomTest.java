import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom;
    private Guest guest;
    private Guest guest1;

    @Before
    public void before(){
        diningRoom = new DiningRoom("Dundee", 2);
        guest = new Guest("Louise");
        guest1 = new Guest("Nathan");
    }

    @Test
    public void hasName(){
        assertEquals("Dundee", diningRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, diningRoom.getCapacity());
    }

    @Test
    public void hasNoGuests(){
        assertEquals(0, diningRoom.getNumberOfGuests());
    }

    @Test
    public void canAddGuests(){
        diningRoom.addGuest(guest);
        diningRoom.addGuest(guest1);
        assertEquals(2, diningRoom.getNumberOfGuests());
    }
}
