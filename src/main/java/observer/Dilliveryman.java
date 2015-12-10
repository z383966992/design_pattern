package observer;

public class Dilliveryman extends Observer{

	private Customer customer;
	private String dilliverymanState;
	
	public Dilliveryman(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public void Update() {
		if("已付款".equals(customer.getCustomerState())) {
			System.out.println("我是配送员，我来发货.");
			setDilliverymanState("已经发货");
		}
	}

	public String getDilliverymanState() {
		return dilliverymanState;
	}

	public void setDilliverymanState(String dilliverymanState) {
		this.dilliverymanState = dilliverymanState;
	}
}
