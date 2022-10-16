package atelier04weiyingzhang;

public class ConditionExercice3 {
	public static void main(String[]args) {
		int p1=10, p2=9, p3=-1,p4=4,p5=8;
		if (p1>p3) {
			if(p1<p2)
				p4 = p1;
			else {
				if(p2>p3)
					p4 = p2;
				else
					p4 = p3;
			}
		}
		System.out.println(p4);
	}

}
