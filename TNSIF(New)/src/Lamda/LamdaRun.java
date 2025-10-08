
package Lamda;

public class LamdaRun {

	public static void main(String[] args) {
		Runnable r = ()-> {
			String s = Thread.currentThread().getName();
			System.out.println(s);
			
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}

}
