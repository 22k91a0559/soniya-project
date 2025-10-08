
package Threads;

public class RunDemo {

	public static void main(String[] args) {
		RunnableInf rn = new RunnableInf();
		Thread t1 = new Thread(rn);
		t1.start();
		

	}

}
