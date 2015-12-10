package template;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSort extends AbstractTemplate{

	
	@Override
	protected boolean compare(Object param1, Object param2) {
		if (param1 instanceof Date && param2 instanceof Date) {
			if (((Date)param1).before((Date)param2)) {
				return false;
			} else {
				return true;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	protected void output(Object[] array) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<array.length; i++) {
			sb.append(format.format(array[i])).append(" ");
		}
		System.out.println(sb);
	}
}
