package observer;

public class Accountant extends Observer{

	private String accountantState;
	private Customer customer;
	
	public Accountant(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public void Update() {
		if("�Ѹ���".equals(customer.getCustomerState())) {
			System.out.println("���ǻ�ƣ���������Ʊ");
			setAccountantState("�Ѿ�����Ʊ");
		}
	}

	public String getAccountantState() {
		return accountantState;
	}

	public void setAccountantState(String accountantState) {
		this.accountantState = accountantState;
	}
}
