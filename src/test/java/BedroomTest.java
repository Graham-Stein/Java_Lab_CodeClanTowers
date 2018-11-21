import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;
    private Guest guest1;

    @Before
    public void before(){
        bedroom = new Bedroom(5, 2, "Double");
        guest = new Guest("Barbara");
        guest1 = new Guest("Fred");
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(5, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasRoomType(){
        assertEquals("Double", bedroom.getRoomType());
    }

    @Test
    public void hasNoGuests(){
        assertEquals(0, bedroom.getRoomGuests());
    }

    @Test
    public void canAddGuests(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getRoomGuests());
    }

    @Test
    public void canRemoveGuestByName(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest);
        bedroom.removeGuestByName("Barbara");
        assertEquals(1, bedroom.getRoomGuests());
    }

    @Test
    public void canFindGuestInListOfGuests(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest);
        assertEquals(guest, bedroom.getGuestByName("Barbara"));
    }
}
