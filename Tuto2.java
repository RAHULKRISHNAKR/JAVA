class MyThread extends Thread {

    public MyThread(String name, int priority) {
        this.setName(name);
        this.setPriority(priority);
    }

    public void run() {
        System.out.println("Thread name: " + this.getName() + "Thread priority: " + this.getPriority() + "\n");
    }
}

public class Tuto2 {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1", 1);
        MyThread thread2 = new MyThread("Thread 2", 5);
        MyThread thread3 = new MyThread("Thread 3", 10);

        thread1.start();
        thread2.start();
        thread3.start();
    }
} 