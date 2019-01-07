package Thread;

class MyThread5 implements Runnable {
    public synchronized void syncMethod() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "'s Thread Start!!");
        for(int i = 0; i < 10; ++i) {
            try {
                Thread.sleep(100);
            }catch (Exception ex) {}
            System.out.println(name + " : " + i);
        }
        System.out.println(name + "'s Thread end!!");
    }

    @Override
    public void run() {
        syncMethod();
    }
}

public class ThreadTest4 {
    public static void main(String[] args) {
        MyThread5 mt = new MyThread5();
        Thread m = new Thread(mt, "First");
        Thread m2 = new Thread(mt, "Second");

        m.start();
        m2.start();
    }

}
