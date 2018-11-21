import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedroomList;
    private ArrayList<DiningRoom> diningRoomList;
    private ArrayList<ConfRoom> confRoomList;

    public Hotel(String name){
        this.name = name;
        this.bedroomList = new ArrayList<>();
        this.diningRoomList = new ArrayList<>();
        this.confRoomList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Bedroom> getBedroomList() {
        return this.bedroomList;
    }

    public ArrayList<DiningRoom> getDiningRoomList() {
        return this.diningRoomList;
    }

    public ArrayList<ConfRoom> getConfRoomList() {
        return this.confRoomList;
    }

    public int getNumberOfConfRooms() {
        return this.confRoomList.size();
    }

    public void addConfRoom(ConfRoom confRoom) {
        this.confRoomList.add(confRoom);
    }

    public int getNumberOfBedrooms() {
        return this.bedroomList.size();
    }

    public int getNumberOfDiningRooms() {
        return this.diningRoomList.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedroomList.add(bedroom);
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRoomList.add(diningRoom);
    }
}
