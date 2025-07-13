import java.util.ArrayList;
    
public class Main {

	public Main() {
		ArrayList<Room> rooms = new ArrayList<Room>();
		Room room1 = new Room(1, 1, false);
		Room room2 = new Room(2, 2, false);
		Room room3 = new Room(3, 1, false);

		Hotel hotel = new Hotel(rooms);
		hotel.addRooms(room1);
		hotel.addRooms(room2);
		hotel.addRooms(room3);

		Customer customer1 = new Customer(1, "Mrs. White");
		Customer customer2 = new Customer(2, "Mr. Green");
		Customer customer3 = new Customer(2, "Miss. Scarlett");
		Customer customer4 = new Customer(3, "Mrs. Peacock");
		Customer customer5 = new Customer(2, "Prof. Plum");
		Customer customer6 = new Customer(3, "Col. Mustard");

		Receptionist receptionist = new Receptionist("Jane");
		Cleaner cleaner = new Cleaner("Michael");
		Manager manager = new Manager("Janhavi");

		receptionist.checkIn( rooms, customer1);
		receptionist.checkIn( rooms, customer2);
		receptionist.checkIn( rooms, customer3);
		receptionist.checkOut(rooms, customer1, manager);
 
		cleaner.cleanRooms( rooms);

		receptionist.checkIn(rooms, customer4);
		receptionist.checkOut( rooms, customer4, manager);
		receptionist.checkIn( rooms, customer5);
		receptionist.checkOut( rooms, customer5, manager);
		receptionist.checkOut( rooms, customer2, manager);
		receptionist.checkOut(rooms, customer3, manager);

		cleaner.cleanRooms( rooms);

		receptionist.checkIn(rooms, customer6);
		receptionist.checkOut( rooms, customer6, manager);
		Console.readLine();
    }
    
    public static void main(String[] args) {
        new Main();
    }
}