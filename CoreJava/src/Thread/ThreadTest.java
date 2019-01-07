package Thread;

class MyThread extends Thread{
    public void run() {
        for (int i = 0; i < 100; ++i) {
            System.out.println("MyThread = " + i);
            try {
                Thread.sleep(10);
            }catch (Exception e) {}
        }
    }

}

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("program start");
        MyThread mt = new MyThread();
        mt.start();
        try{
            Thread.sleep(3000);
        }catch (Exception ex) {}
        System.out.println("program end");
    }
}
