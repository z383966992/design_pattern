package observer;

public class Dilliveryman extends Observer{

	private Customer customer;
	private String dilliverymanState;
	
	public Dilliveryman(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public void Update() {
		if("�Ѹ���".equals(customer.getCustomerState())) {
			System.out.println("��������Ա����������.");
			setDilliverymanState("�Ѿ�����");
		}
	}

	public String getDilliverymanState() {
		return dilliverymanState;
	}

	public void setDilliverymanState(String dilliverymanState) {
		this.dilliverymanState = dilliverymanState;
	}
}
