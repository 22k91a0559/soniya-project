package Threads;

public class Threads extends Thread {
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				System.out.println("hello");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				System.out.println("e");
			}
		}
	}
}

