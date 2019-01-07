package Thread;

class MyThread4 extends Thread {
    private String name;
    public MyThread4(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < 100; ++i) {
//            try {
//                Thread.sleep(20);
//            }catch(Exception e) {}
            System.out.println(name + " : " + i + "\t");
        }
    }
}

public class ThreadTest3 {
    public static void main(String[] args) {
        MyThread4 first = new MyThread4("First");
        MyThread4 second = new MyThread4("Second");

        first.setPriority(Thread.MIN_PRIORITY);
        second.setPriority(Thread.MAX_PRIORITY);

        first.start();
        second.start();
    }
}
