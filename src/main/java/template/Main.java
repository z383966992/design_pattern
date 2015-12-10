package template;

import java.util.Calendar;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		AbstractTemplate Inttemplate = new IntegerSort();
		Inttemplate.sort(new Integer[]{1,9,3,4,6,2,7});
		
		
		AbstractTemplate Datetemplate = new DateSort();
		Calendar cal1 = Calendar.getInstance();
		cal1.add(Calendar.YEAR, 3);
		Date date1 = cal1.getTime();
		
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.YEAR, -3);
		Date date2 = cal2.getTime();
		
		Datetemplate.sort(new Date[]{new Date(), date1, date2});
	}
}
