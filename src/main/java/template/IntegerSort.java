package template;

public class IntegerSort extends AbstractTemplate{
	
	@Override
	protected boolean compare(Object param1, Object param2) {
		if (param1 instanceof Integer && param2 instanceof Integer) {
			if ((Integer)param1 <= (Integer)param2) {
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
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<array.length; i++) {
			sb.append(array[i].toString()).append(" ");
		}
		System.out.println(sb);
		
	}
	
}
