package Exception;

import java.util.Scanner;

public class MyExceptionTest {
    public static void input() throws MyException{
        Scanner in = new Scanner(System.in);
        System.out.print("국어점수 : ");
        int kor = in.nextInt();
        if (kor <0 || kor > 100) {
            MyException me = new MyException();
            in.close();
            throw me;
        }
        in.close();
    }

    public static void main(String[] args) {
        try {
            input();
        }catch (MyException e) {
            System.out.println("MESSAGE : " + e.getLocalizedMessage());
        }finally {
            System.out.println("프로그램 끝");
        }
    }
}
