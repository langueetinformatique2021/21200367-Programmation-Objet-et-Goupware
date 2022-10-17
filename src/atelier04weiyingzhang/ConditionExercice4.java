package atelier04weiyingzhang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConditionExercice4 {
	public static void main(String[]args) {
		int p1=10, p2=9, p3=-1,p4=4,p5=8;
		int p6;
		int[] num = {p1,p2,p3,p4,p5};
		Arrays.sort(num);
		p6 = num[2];
		System.out.println(p6);
	}
}
//S'il y a trop de chiffre dans une liste,
//on doit utilise le programme ci-dessous:
//	
//public class ConditionExercice4 {
//	public static void main(String[]args) {
//		int p1=10, p2=9, p3=-1,p4=4,p5=8;
//		int p6;
//		int[] num = {p1,p2,p3,p4,p5};
//		Arrays.sort(num);
//		if (num.lenth%2 ==0) {
//			p6 = ((num[(num.lenth/2)-1]) + (num[num.lenth/2]) /2;
//			else {
//				p6 = (num[num.lenth/2]);
//			}
//		}
//		System.out.println(p6);
