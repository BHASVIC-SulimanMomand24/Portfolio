import java.util.ArrayList;

public class Receptionist {
    String name;
    
	Receptionist(String name) {
        this.name = name;
	}
    public void checkIn( ArrayList<Room> hotel, Customer customer) {
        Room room = new Room(customer.getRoomBooking(), hotel.get(customer.getRoomBooking() - 1).getSize(), hotel.get(customer.getRoomBooking() - 1).isClean());
        room.addOccupant(customer);
        System.out.println(this.name + " checked in " + customer.getName());
    }

    public void checkOut( ArrayList<Room> hotel, Customer customer, Manager manager) {
        Room room = new Room(customer.getRoomBooking(), hotel.get(customer.getRoomBooking() - 1).getSize(), hotel.get(customer.getRoomBooking() - 1).isClean());
        room.removeOccupant(hotel.get(customer.getRoomBooking() - 1), customer);
        System.out.println(this.name + " checked out " + customer.getName());
        manager.takeFeedback(customer);
    }
}