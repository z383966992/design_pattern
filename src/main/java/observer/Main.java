package observer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerState("ÒÑ¸¶¿î");
		Observer observer1 = new Accountant(customer);
		Observer observer2 = new Cashier(customer);
		Observer observer3 = new Dilliveryman(customer);
		
		customer.attach(observer1);
		customer.attach(observer2);
		customer.attach(observer3);
		
		customer.Notify();
	}
}