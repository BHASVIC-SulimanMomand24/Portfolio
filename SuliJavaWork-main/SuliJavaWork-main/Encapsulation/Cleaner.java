import java.util.ArrayList;

public class Cleaner {
	private String name;
	
    Cleaner(String name) {
        this.name = name;
    }

    public void cleanRooms(ArrayList<Room> hotel) {
        for (int i = 0; i < hotel.size(); i++) {
            if (hotel.get(i).getOccupants().isEmpty()) {
                hotel.get(i).setClean(true);
                System.out.println(this.name + " cleaned Room " + hotel.get(i).getNumber());
            }
        }
    }
}