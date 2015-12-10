package template;

public abstract class AbstractTemplate {
	
	//Ã°ÅİÅÅĞòÖ÷Ìå
	protected void sort(Object []array) {
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(compare(array[i], array[j])) {
					Object temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		output(array);
	}
	
	protected abstract boolean compare(Object param1, Object param2);
	
	protected abstract void output(Object[] array);
}
