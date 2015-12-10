package observer;

public class Cashier extends Observer{
	
	private Customer customer;
	private String cashierState;
	
	public Cashier(Customer customer){
		this.customer = customer;
	}

	@Override
	public void Update() {
		if("已付款".equals(customer.getCustomerState())) {
			System.out.println("我是出纳员，我给登记入账。");
			setCashierState("已入账");
		}
	}

	public String getCashierState() {
		return cashierState;
	}

	public void setCashierState(String cashierState) {
		this.cashierState = cashierState;
	}
}
