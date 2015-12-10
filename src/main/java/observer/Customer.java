package observer;

import java.util.LinkedList;
import java.util.List;

//具体主题，这里是客户
public class Customer implements ISubject{

	private String customerState;
	private List<Observer> observers = new LinkedList<Observer>();
	
	//增加观察者
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	//移除观察者
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
