import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfRoomTest {

    private ConfRoom confRoom;
    private Guest guest;
    private Guest guest1;

    @Before
    public void before(){
        confRoom = new ConfRoom("Ruby", 2, false);
        guest = new Guest("Louise");
        guest1 = new Guest("Nathan");
    }

    @Test
    public void hasName(){
        assertEquals("Ruby", confRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, confRoom.getCapacity());
    }

    @Test
    public void hasAudioVisual(){
        assertEquals(false, confRoom.isAudioVisual());
    }

    @Test
    public void hasNoGuests(){
        assertEquals(0, confRoom.getNumberOfGuests());
    }

    @Test
    public void hasGuests(){
        confRoom.addGuest(guest);
        confRoom.addGuest(guest1);
        assertEquals(2, confRoom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuestByName(){
        confRoom.addGuest(guest1);
        confRoom.addGuest(guest);
        confRoom.removeGuestByName("Nathan");
        assertEquals(1, confRoom.getNumberOfGuests());
    }

    @Test
    public void canFindGuestInListOfGuests(){
        confRoom.addGuest(guest1);
        confRoom.addGuest(guest);
        assertEquals(guest1, confRoom.getGuestByName("Nathan"));
    }
}
