package Devoir5;

public class E421 extends Exception{
	public E421(String name, TroisDes tire) {
		super("421 désordre: \nLanceur : " + name + tire.toString());
	}
	public E421(TroisDes tire, String name) {
		super("421 dans l'ordre: \nLanceur : " + name + tire.toString());
	}
	

}
