import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;

    public Bedroom(int roomNumber, int capacity, String roomType){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getRoomGuests(){
        return this.guests.size();
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuestByName(Guest guest){
        if (this.guests.contains(guest)){
                this.guests.remove(guest);
            }
        return;
        }

    public Guest getGuestByName(String name) {
        Guest guestToRemove = null;
        for (Guest guest : this.guests) {
            if (guest.name.equals(name)) {
                guestToRemove = guest;
            }
        }
        return guestToRemove;
    }
}
