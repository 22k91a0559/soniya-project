
package Threads;

public class Mythread extends Thread{
	 public void run() {
     for (int i = 1; i <= 3; i++) {
		           
	 Thread.yield();
      System.out.println(getName() + " is running: " + i);
     }
		     }
}



