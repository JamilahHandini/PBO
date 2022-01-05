//@author: Jamilah Handini

public class MainMultiThreadingwithExtends {
	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {		//loop for create many threads
		multiThreadingwithExtends multi = new multiThreadingwithExtends(i); //instance thread
		multi.start();				//running parallel threads
		}
	}
}
