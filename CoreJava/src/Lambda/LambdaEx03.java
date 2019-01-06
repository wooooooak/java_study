package Lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaEx03 {
    public static void printList(List<Integer> list, CheckDataInterface checkData) {
        for (Integer i: list) {
            if (checkData.check(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 200, 300, 400, 500, 600);
//        익명 중첩  클래스를 사용한 엣날 방법.
//        printList(list, new CheckDataInterface() {
//            @Override
//            public boolean check(Integer i) {
//                if (i>300) return true;
//                return false;
//            }
//        });

        // 람다를 표현한 세련된 방법
        printList(list, (i) -> {return i > 300;});

    }
}
