
public class multiThreadwithInterface implements Runnable{		//class thread with interface 
	private int threadNumber;
	public multiThreadwithInterface(int threadNumber) {		//constructor
		this.threadNumber = threadNumber;
	}
	@Override
	public void run() {						//override run method from interface runnable
		for(int i = 1; i<=10 ; i++) {
			System.out.println("i : "+i+"     from thread: "+threadNumber );
			try {								//for exception
				Thread.sleep(1000);				//time to wait the task running
			}catch(InterruptedException e) {
			}
		}
	}
}
