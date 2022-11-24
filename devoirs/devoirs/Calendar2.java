package devoirs;
/**
 * 
 * @author zhang
 *
 */

import java.util.Calendar;
import java.util.Date;

public class Calendar2 extends Calendar {
		
		private boolean cours;
		
		public Calendar2() {
			Date date = new Date();
			this.setTime(date);	
		}
		
		public void creation() {
			if (this.get(Calendar.DAY_OF_WEEK) ==4) {
				(this.get(Calendar.HOUR_OF_DAY)>9 && this.get(Calendar.HOUR_OF_DAY)<12 && this.get(Calendar.MINUTE)>30){
						cours = true;
						}
			} else{
				cours = false;
			}
			
			
			System.out.println("TIME: " + this.getTime());
		}
		
		
		public void afficher() {
			Date date = new Date();
			Calendar calendar = new Calendar();
			calendar.setTime(date);	
			System.out.println("TimeCourante: " + calendar.getTime());
		}

		
		public void duree() {
			Date date = new Date();
			Calendar calendar = new Calendar();
			calendar.setTime(date);	
			long nbSeconde = (calendar.getTimeInMillis()- this.getTimeInMillis()) / 1000;
			System.out.println("nbSeconde " + nbSeconde);
			
		}		

	}
}