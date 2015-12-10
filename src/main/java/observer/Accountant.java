package observer;

public class Accountant extends Observer{

	private String accountantState;
	private Customer customer;
	
	public Accountant(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public void Update() {
		if("已付款".equals(customer.getCustomerState())) {
			System.out.println("我是会计，我来开发票");
			setAccountantState("已经开发票");
		}
	}

	public String getAccountantState() {
		return accountantState;
	}

	public void setAccountantState(String accountantState) {
		this.accountantState = accountantState;
	}
}
