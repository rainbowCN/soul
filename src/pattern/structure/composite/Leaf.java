package pattern.structure.composite;



import java.lang.String;

public class Leaf extends Component {
	public void operation() {
		System.out.println(" --"+this.name);
	}

	public Leaf(String name) {
		super(name);
	}
}