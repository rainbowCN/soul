package pattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	public List<Component> components;
	
	public Composite(String name) {
		super(name);
		components = new ArrayList<Component>();
	}
	
	public void operation() {
		System.out.println("=="+this.name);
	    for (Component comp : components) {
	    	comp.operation();
        } 
	}

	public void add(Component component) {
		components.add(component);
	}

	public void remove(Component component) {
		components.remove(component);
	}
}