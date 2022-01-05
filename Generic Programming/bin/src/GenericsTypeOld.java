
public class GenericsTypeOld {
	private Object t;
	
	public Object get() {
		return t;
	}
	
	public void set(Object t) {
		this.t=t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsTypeOld type = new GenericsTypeOld();
		type.set("Java");		//saat mengganti type.set(123) atau dengan integer maka terjadi exceptions
		String str = (String) type.get();
		System.out.println(str);
		//type casting, error prone and can cause ClassCastExecptions
	}

}
