package devoirs;

/**
 * 
 * @author zhang
 *
 */

public class Animal {
	private String type;
	private String color;
	private int feetnumber;
	
	public Animal(String types, String colors, int feetnumbers) {
		this.type = types;
		this.color = colors;
		this.feetnumber = feetnumbers;
	}
	public void introduce() {
		System.out.println("This animal is a" + type +" and has " + feetnumber + "legs." );
	}
	public void introduce2() {
		System.out.println("It is " + color + "in color.");
	}
}
