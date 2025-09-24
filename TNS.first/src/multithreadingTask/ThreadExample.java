package multithreadingTask;
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Print thread name and iteration
            System.out.println(getName() + " - Count: " + i);

            // Example: make the thread yield at iteration 3
            if (i == 3) {
                System.out.println(getName() + " is yielding...");
                Thread.yield(); // gives chance to other threads
            }
            try {
                Thread.sleep(500); // to slow down so output is clearer
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        t1.start();
        t2.start();

        try {
            // Using join(): main thread waits until t1 and t2 finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread ends after both threads finish.");
    }
}

