

public class GenericsType<T> {
		private T t;
		public T get(){
		return this.t;
		}
		public void set(T t1){
		this.t=t1;
		}
		public static void main(String args[]){
		GenericsType<String> type = new GenericsType<>();
		type.set("Java"); //valid
		GenericsType type1 = new GenericsType(); //raw type
		type1.set("Java"); //valid
		type1.set(10); //valid and autoboxing support
		
		System.out.println(type.get());		//printout --> Java
		System.out.println(type1.get());	//printout --> 10 , karena ter-replace 
		}
}


