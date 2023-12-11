public class Thread2 extends Thread {
    String lock1 = "lock1";
    String lock2 = "lock2";

    public void run() {
        synchronized (lock2) {
            System.out.println(this.getName() + " lock included2");
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + " waiting for lock on lock1");
            synchronized (lock1) {
                System.out.println(this.getName() + " lock included1");
            }
        }
    }
}
