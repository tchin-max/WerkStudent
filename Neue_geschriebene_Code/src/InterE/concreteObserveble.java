package InterE;

import java.util.ArrayList;
import java.util.Arrays; 
import java.util.List;

public class concreteObserveble implements Observable    {

	private List<Observer> observer = new ArrayList();
	private String state;
	@Override
	public void add(Observer o) {
		this.observer.add(o);
	}

	@Override
	public void remove(Observer o) {
		this.observer.add(o);
	}

	@Override
	public void notif() {
		for (Observer obsernoty : observer) {
			obsernoty.updade();
			
		}
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
		this.notif();
		
	}


}
