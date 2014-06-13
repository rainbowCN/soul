package pattern.structure.observer;

public class SubjectA extends Subject {
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void unregisterObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
	    for (Observer observer : observers) {
	    	observer.notifyObserver();
        } 
	}
}