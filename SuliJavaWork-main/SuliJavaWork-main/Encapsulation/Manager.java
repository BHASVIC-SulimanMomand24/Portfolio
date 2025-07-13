public class Manager {
	private String name;
	
    Manager(String name) {
        this.name = name;
    }
    public void takeFeedback( Customer customer) {
        if (customer.getFeedback() > 0)
            System.out.println(this.name + " says: " + customer.getName() + " was happy with their stay!");
        else if (customer.getFeedback() < 0)
            System.out.println(this.name + " says: " + customer.getName() + " was unhappy with their stay!");
        else
            System.out.println(this.name + " says: " + customer.getName() + " found their stay ok.");
    }
}