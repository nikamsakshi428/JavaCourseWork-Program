class MyThread extends Thread {
    public void run() {
        System.out.println("Thread started...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        System.out.println("Thread finished.");
    }
}

public class prog69 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        try {
            t.join(); // Wait for t to finish
        } catch (Exception e) {}

        System.out.println("Main thread continues...");
    }
}