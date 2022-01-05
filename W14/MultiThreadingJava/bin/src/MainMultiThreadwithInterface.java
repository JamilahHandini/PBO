
public class MainMultiThreadwithInterface {
	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {				//loop for create many threads
		multiThreadwithInterface multi = new multiThreadwithInterface(i);	//instance thread
		Thread threadInterface = new Thread(multi);							//instance from interface
		threadInterface.start();	
		}
	}
}
