package pattern.structure.observer;


public class Client {
	public Subject subject;
	public static void main(String[] args){
		Subject subject = new SubjectA();
		
		Observer oA = new ObserverA();
		Observer oB = new ObserverB();
		subject.registerObserver(oA);
		subject.registerObserver(oB);
		
		subject.notifyObservers();
	}
}