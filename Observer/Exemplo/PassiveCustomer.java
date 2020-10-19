
public class PassiveCustomer implements Observer {
	
    public void update(String message) {
        System.out.println("Passive customer made note of the sale.");
        // Passive customer does not react to the message too much
    }
}