import java.util.ArrayList;

public class Room {
	private int number;
	private int size;
    private ArrayList<Customer> occupants;
	private boolean clean;
	
    Room(int number, int size, boolean clean) {
        this.number = number;
        this.size = size;
        this.occupants = new ArrayList<Customer>();
        this.clean = clean;
    }
    public void addOccupant( Customer occupantIn) {
        if (occupants.size() < size) {
            occupants.add(occupantIn);
            occupantIn.IncreaseFeedback();
        }
        else {
            occupantIn.DecreaseFeedback();
            return;
        }
        if (clean == true) {
            occupantIn.IncreaseFeedback();
        }
        else {
            occupantIn.DecreaseFeedback();
            clean = false;
        }
    }

    public void removeOccupant(Room room, Customer occupantOut) {
        int index = -1;
        for (int i = 0; i < room.occupants.size(); i++) {
            if (room.occupants.get(i).equals(occupantOut))
                index = i;
        }
        if (index != -1)
            room.occupants.remove(index);
    }

    public ArrayList<Customer> getOccupants() {
        return occupants;
    }

    public void setOccupants(ArrayList<Customer> occupants) {
        this.occupants = occupants;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}