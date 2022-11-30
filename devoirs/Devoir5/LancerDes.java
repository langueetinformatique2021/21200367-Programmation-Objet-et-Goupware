package Devoir5;

import java.util.ArrayList;
import atelier08.TroisDes;

public class LancerDes extends Aleat{
	String Lanceur = "name";
	int faces = 6;
	
	public LancerDes(String Lanceur, int faces) {
		
		super(6);
		this.Lanceur = Lanceur;
		this.faces = faces;
		
	}
	
	public TroisDes lancer() throws E421 {
		TroisDes tire = new TroisDes(super.get(), super.get(), super.get());
		return tire;
		
	}
	
	public void nameLauceur() {
		System.out.println("Lanceur:" + Lanceur);
		
	}
	private void test421(String name, TroisDes tire) throws E421 {
		int d1 = tire.d1();
		int d2 = tire.d2();
		int d3 = tire.d3();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		if (d1 == 4) if (d2 == 2)if (d3== 1) throw new E421(name, tire);
		
		if (list.contains(4)) if (list.contains(2)) if (list.contains(1)) throw new E421(tire, name);
	}		

}
