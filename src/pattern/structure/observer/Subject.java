package pattern.structure.observer;
import java.util.List;
import java.util.ArrayList;


abstract public class Subject {
	
	Subject() {
		this.observers = new ArrayList<Observer>();
	}
	
	public List<Observer> observers;

	abstract public void registerObserver(Observer observer);

	abstract public void unregisterObserver(Observer observer);

	abstract public void notifyObservers();
}