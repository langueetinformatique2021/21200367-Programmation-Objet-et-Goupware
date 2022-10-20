package atelier05weiyingzhang;

import crous04.Date;
/** calcul du nombre de jours avant le 14 juillet 2023
 * 
 * @author zhang
 *
 */
public class GestionDeDates {
	public static void main(String[]args) {
		cours04.Date today = new cours04.Date (20,10,2022);
		cours04.Date fete14 = new cours04.Date (14,7,2023);
		int nJours = 0;
		do {
			today.Incrementer();
			nJours++;
		} while (today.CompareTo(fete14));
		System.out.println(nJours);
	}

}
