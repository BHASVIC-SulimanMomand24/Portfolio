public class Customer {
	private int roomBooking;
	private String name;
	private int feedback;
	
    Customer(int roomBooking, String name) {
        this.roomBooking = roomBooking;
        this.name = name;
        this.feedback = 0;
    }
    public int getRoomBooking() {
        return roomBooking;
    }
    public void setRoomBooking(int roomBooking) {
        this.roomBooking = roomBooking;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getFeedback() {
        return feedback;
    }
    public void setFeedback(int feedback) {
        this.feedback = feedback;
    }
    public void IncreaseFeedback(){
        this.feedback++;
    }
    public void DecreaseFeedback(){
        this.feedback--;
    }
}