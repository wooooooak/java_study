package Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPoll {
    public static void main(String[] args) {
        Runnable hello = () -> {
            for (int i = 0; i < 101; i++) {
                System.out.println("Hello " + i);
            };
        };
        Runnable goodbyes = () -> {
            for (int i = 0; i < 101; i++) {
                System.out.println("Goodbye " + i);
            };
        };
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(hello);
        executor.execute(goodbyes);
    }
}
