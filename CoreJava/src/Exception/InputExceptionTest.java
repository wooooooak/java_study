package Exception;

import java.util.Scanner;

public class InputExceptionTest {
    public static void input() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("국어 점수(0~100) = ");
        int kor = in.nextInt();
        if (kor < 0 || kor > 100) {
            Exception ex = new RuntimeException("점수 범위를 벗어난 오류.");
            in.close();
            throw ex;
        }
        System.out.println("입력한 점수는 " + kor + "점입니다.");
    }

    public static void input2() {
        Scanner in = new Scanner(System.in);
        System.out.print("나눌 수 = ");
        int su = in.nextInt();
        int result = 100 / su;
        System.out.println("100 / " + su + "= " + result);
    }

    public static void main(String[] args) throws Exception {
        input2();
    }
}
