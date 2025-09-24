package waitNotifyExample;
class SharedResource {
    synchronized void waitForSignal() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting...");
            wait(); // Makes this thread wait until notified
            System.out.println(Thread.currentThread().getName() + " got notified!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void notifyOne() {
        System.out.println("Notifying one thread...");
        notify(); // Wakes up one waiting thread
    }

    synchronized void notifyAllThreads() {
        System.out.println("Notifying all threads...");
        notifyAll(); // Wakes up all waiting threads
    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        Runnable waitingTask = () -> resource.waitForSignal();

        Thread t1 = new Thread(waitingTask, "Thread-1");
        Thread t2 = new Thread(waitingTask, "Thread-2");
        Thread t3 = new Thread(waitingTask, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(1000); // Let threads start and wait

        resource.notifyOne(); // Wake one thread

        Thread.sleep(1000); // Pause to observe output

        resource.notifyAllThreads(); // Wake all remaining threads
    }
}
