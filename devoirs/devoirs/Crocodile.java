package devoirs;
/**
 * 
 * @author zhang
 *
 */

public class Crocodile extends Reptile {
	private String name;
	public Crocodile(String types, String colors, int feetnumbers, String environments, int temperatures, String names) {
		super(types, colors, feetnumbers, environments, temperatures);
		name = names;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void Name() {
		System.out.println("Its name is " + name);
	}
	void introTestagain() {
		super.reintroduce();
		this.Name();
	}
}
