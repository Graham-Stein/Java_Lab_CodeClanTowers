import java.util.ArrayList;

public class ConfRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;
    private boolean audioVisual;

    public ConfRoom(String name, int capacity, boolean audioVisual){
        this.name = name;
        this.capacity = capacity;
        this.audioVisual = audioVisual;
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public int getNumberOfGuests(){
        return this.guests.size();
    }

    public boolean isAudioVisual() {
        return this.audioVisual;
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