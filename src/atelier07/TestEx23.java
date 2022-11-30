package atelier07;
/**
 * 
 * @author zhang
 *
 */
import java.util.GregorianCalendar;
import java.util.Date;

public class TestEx23 {

	public static void main(String[] args) {

		GregorianCalendar calendar = new GregorianCalendar();
		Date date = new Date();

		calendar.setTime(date);

		System.out.println("TIME: " + calendar.getTime());
		System.out.println("YEAR: " + calendar.get(calendar.YEAR));
		System.out.println("MONTH: " + calendar.get(calendar.MONTH));
		System.out.println("DATE: " + calendar.get(calendar.DATE));

		System.out.println("DAY_OF_YEAR: " + calendar.get(calendar.DAY_OF_YEAR));
		System.out.println("HOUR_OF_DAY: " + calendar.get(calendar.HOUR_OF_DAY));

	}

}
