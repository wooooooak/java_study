package Lambda;

public class MainClass {

    public static void main(String args[]) {
        LambdaInterface1 li1 = (String s1, String s2, String s3) -> { System.out.println(s1 + " " + s2 + " " + s3); };
        li1.method("hello", "java", "world");

        System.out.println();

        // 매개변수가 1 개이거나 타입이 같을 때, 타입을 생략할 수 있다.
        LambdaInterface2 li2 = (s1) -> { System.out.println(s1);};
        li2.method("Hello");

        LambdaInterface3 li3 = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(li3.method(10,20));
    }
}
