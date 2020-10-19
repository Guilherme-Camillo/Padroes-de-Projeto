
public class Main {
	
  public static void main(String[] args) {

    
        // Initialization
    Subject loja = new Store();
    Observer customer1 = new PassiveCustomer();
    Observer customer2 = new ShopaholicCustomer();
    Observer customer3 = new ShopaholicCustomer();

    // Adding two customers to the newsletter
    loja.addSubscriber(customer1);
    loja.addSubscriber(customer2);

    // Notifying customers (observers)
    loja.notifySubscribers();

    // A customer has decided not to continue following the newsletter
    loja.removeSubscriber(customer1);

    // customer2 told customer3 that a sale is going on
    loja.addSubscriber(customer3);

    // Notifying the updated list of customers
    loja.notifySubscribers();
  }
}
