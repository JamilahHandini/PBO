//@author: Jamilah Handini

public class multiThreadingwithExtends extends Thread{ //class thread with extends class thread
	private int threadNumber;							
	public multiThreadingwithExtends(int threadNumber) {		//constructor
		this.threadNumber = threadNumber;					
	}
	@Override	
	public void run() {									//override run method from class extends
		for(int i = 1; i<=10 ; i++) {				
			System.out.println("i : "+i+"     from thread: "+threadNumber );
			try {										//for exception
				Thread.sleep(1000);						//time to wait the task running
			}catch(InterruptedException e) {
			}
		}
	}		
}

