import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> bedroom;
    private String roomType;

    public Bedroom(int roomNumber, int capacity, String roomType){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.bedroom = new ArrayList<>();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList<Guest> getBedroom() {
        return bedroom;
    }

    public int getRoomGuests(){
        return this.bedroom.size();
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void addGuest(Guest guest) {
        this.bedroom.add(guest);
    }
}
