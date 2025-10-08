package Threads;

public class RunnableInf implements Runnable {
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				System.out.println(i);
				Thread.sleep(2000);
			}catch(Exception e){

				System.out.println("this is Exception");
			}
		}
	}
	

}