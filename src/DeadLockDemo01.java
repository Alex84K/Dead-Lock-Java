
public class DeadLockDemo01 {
    public static void main(String[] a) {

        Thread thread1 = new Thread1();
        Thread thread2 = new Thread2();

        thread1.start();
        thread2.start();
    }
}

