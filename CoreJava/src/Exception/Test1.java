package Exception;

// 예외 전가
public class Test1 {
    public static void aaa() throws Exception{
        System.out.println("Test");
        // 예외가 발생할 코드가 있다.
        // 직접 처리하던가 전가하던가 해라.
        // aaa()를 호출하면 에러가 발생할 가능성이 높다!
        // 따라서 aaa()를 호출할 거면, 니가 에러를 처리하던가
        // 또 전가를 해라
    }
    public static void bbb() throws Exception{
        aaa();
    }
    public static void ccc() throws Exception{
        bbb();
    }
    public static void main(String[] args) throws Exception{
        ccc();
    }
}
