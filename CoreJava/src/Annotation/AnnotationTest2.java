package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
        // 클래스에 적용되는 어노테이션 이라는 뜻
@interface MyAnnotaion {
    String author();

    double version();
}

@Target(ElementType.METHOD)
        // 메소드에 적용되는 어노테이션 이라는 뜻
@interface MyMethodAnnotation {
    String name();
}

@MyAnnotaion(author = "이용준", version = 1.2)
public class AnnotationTest2 {

    @MyMethodAnnotation(name = "main")
    public static void matin(String[] args) {

    }

}
