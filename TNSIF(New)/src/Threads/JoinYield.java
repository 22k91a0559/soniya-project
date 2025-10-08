
package Threads;

public class JoinYield {

	public static void main(String[] args) {
		 Mythread t1 = new Mythread();
         Mythread t2 = new Mythread();
		
		         t1.setName("Thread-1");
		         t2.setName("Thread-2");
		 
		          t1.start();
		         t2.start();
		
		          try {
		
		             t1.join();
		         } catch (InterruptedException e) {
		              System.out.println(e);
		         }
		 
		          System.out.println("Main thread continues after Thread-1 has finished.");
		      }
		  


	}


