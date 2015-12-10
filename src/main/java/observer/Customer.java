package observer;

import java.util.LinkedList;
import java.util.List;

//�������⣬�����ǿͻ�
public class Customer implements ISubject{

	private String customerState;
	private List<Observer> observers = new LinkedList<Observer>();
	
	//���ӹ۲���
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	//�Ƴ��۲���
	public void detech(Observer observer) {
		observers.remove(observer);
	}
	
	public void Notify() {
		for (Observer observer : observers) {
			observer.Update();
		}
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

}
