package Thread;

class MyThread2 extends Thread{
    public void run() {
        System.out.println("MyThread 2");
    }

}

class MyThread3 implements Runnable{
    @Override
    public void run() {
        System.out.println("MyThread 3");
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        MyThread2 mt2 = new MyThread2();
        mt2.start();

        // 인터페이스로 만든 Thread
        MyThread3 mt3 = new MyThread3();
        Thread mt = new Thread(mt3); // Thread라는 클래스의 도움을 받아서 start를 실행
        mt.start();
    }
}
