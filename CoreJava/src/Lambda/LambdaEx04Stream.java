package Lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaEx04Stream {
    public static void display(Integer i) {
        System.out.println(i);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 200, 300, 400, 500, 600);

        list.stream().forEach(LambdaEx04Stream::display);
        list.stream().forEach((i) -> {System.out.println(i);});

        list.stream().filter(i-> {return i > 300;}).forEach(LambdaEx04Stream::display);
    }


}
