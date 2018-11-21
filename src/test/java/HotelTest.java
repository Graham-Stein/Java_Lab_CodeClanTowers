import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private ArrayList<Bedroom> bedroomList;
    private ArrayList<DiningRoom> diningRoomList;
    private ArrayList<ConfRoom> confRoomList;
    private ConfRoom confRoom;
    private ConfRoom confRoom2;
    private DiningRoom diningRoom;
    private DiningRoom diningRoom2;
    private Bedroom bedroom;
    private Bedroom bedroom2;
    private Guest guest;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;


    @Before
    public void before(){
        hotel = new Hotel("CodeClan Towers");
        bedroomList = new ArrayList<>();
        diningRoomList = new ArrayList<>();
        confRoomList = new ArrayList<>();
        confRoom = new ConfRoom("Ruby", 2, false);
        confRoom2 = new ConfRoom("Java", 5, true);
        diningRoom = new DiningRoom("Dundee", 2);
        diningRoom2 = new DiningRoom("Glasgow", 1);
        bedroom = new Bedroom(5, 2, "Double");
        bedroom2 = new Bedroom(9, 1, "Single");
        guest = new Guest("Louise");
        guest1 = new Guest("Nathan");
        guest2 = new Guest("Barbara");
        guest3 = new Guest("Fred");
    }

    @Test
    public void confRoomListStartsEmpty(){
        assertEquals(0, hotel.getNumberOfConfRooms());
    }

    @Test
    public void canAddConfRoom(){
        hotel.addConfRoom(confRoom);
        hotel.addConfRoom(confRoom2);
        assertEquals(2, hotel.getNumberOfConfRooms());
    }

    @Test
    public void diningRoomListStartsEmpty(){
        assertEquals(0, hotel.getNumberOfDiningRooms());
    }

    @Test
    public void canAddDiningRoom(){
        hotel.addDiningRoom(diningRoom);
        hotel.addDiningRoom(diningRoom2);
        assertEquals(2, hotel.getNumberOfDiningRooms());
    }

    @Test
    public void bedroomListStartsEmpty(){
        assertEquals(0, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom2);
        assertEquals(2, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canCheckInGuestToBedroom(){
        // call a method in Hotel that takes guest name, initialises the guest, checks them into a bedroom
    }
}
