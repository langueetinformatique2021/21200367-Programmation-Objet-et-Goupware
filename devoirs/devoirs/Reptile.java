package devoirs;
/**
 * 
 * @author zhang
 *
 */

public class Reptile extends Animal {
	private String environment;
	private int temperature;
	public Reptile (String types, String colors, int feetnumbers, String environments, int temperatures) {
		super(types, colors, feetnumbers);
		environment = environments;
		temperature = temperatures;
	}
	public String getenvironment() {
		return environment;
	}
	public void setenvironment(String environment) {
		this.environment = environment;
	}
	public int gettemperature() {
		return temperature;
	}
	public void settemperature(int temperature) {
		this.temperature = temperature;
	}
	public void reintroduce() {
		System.out.println("And it lives in a" + environment + "with a temperature of" + temperature + "degrees.");
	}
	void introTest() {
		super.introduce();
		super.introduce2();
		this.reintroduce();
	}
}
