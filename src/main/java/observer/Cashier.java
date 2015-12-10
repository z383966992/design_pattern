package observer;

public class Cashier extends Observer{
	
	private Customer customer;
	private String cashierState;
	
	public Cashier(Customer customer){
		this.customer = customer;
	}

	@Override
	public void Update() {
		if("�Ѹ���".equals(customer.getCustomerState())) {
			System.out.println("���ǳ���Ա���Ҹ��Ǽ����ˡ�");
			setCashierState("������");
		}
	}

	public String getCashierState() {
		return cashierState;
	}

	public void setCashierState(String cashierState) {
		this.cashierState = cashierState;
	}
}
