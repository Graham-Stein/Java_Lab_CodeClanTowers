import java.util.ArrayList;

public class DiningRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public DiningRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getNumberOfGuests(){
        return this.guests.size();
    }


    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }


    public void removeGuestByName(String name) {
        Guest guest = this.getGuestByName(name);
        if (this.guests.contains(guest)){
            this.guests.remove(guest);
        }
//        return;
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
