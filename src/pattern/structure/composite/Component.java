package pattern.structure.composite;



import java.lang.String;

abstract public class Component {
	abstract public void operation();

	public Composite components;
	public String name;
	public Component(String name) {
		this.name = name;
	}
}