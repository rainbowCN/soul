package pattern.structure.observer;


abstract public class Observer {
	public Subject observers;

	abstract public void notifyObserver();
}