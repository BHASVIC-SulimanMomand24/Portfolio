import java.util.ArrayList;

public class Hotel {
	ArrayList<Room> rooms;
	
    Hotel(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    public void addRooms(Room room) {
        rooms.add(room);
    }
}