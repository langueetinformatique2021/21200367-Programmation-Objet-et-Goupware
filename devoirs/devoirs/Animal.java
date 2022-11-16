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
	public String gettype(){
		return type;
	}
	public void settype(String type){
		this.type = type;		
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public int getfeetnumber() {
		return feetnumber;
	}
	public void setfeetnumber(int feetnumber) {
		this.feetnumber = feetnumber;
	}
	public void introduce() {
		System.out.println("This animal is a" + type +" and has " + feetnumber + "legs." );
	}
	public void introduce2() {
		System.out.println("It is " + color + "in color.");
	}
}
