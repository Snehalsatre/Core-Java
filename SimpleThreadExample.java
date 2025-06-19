class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running thread: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class SimpleThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); 

        System.out.println("Main thread is done.");
    }
}
