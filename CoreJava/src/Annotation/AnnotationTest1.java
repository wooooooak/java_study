package Annotation;

class SuperClass {
    public void aaa() {}
    public void bbb() {}
}

class SubClass extends SuperClass {
    @Override
    public void aaa() {}

    @Deprecated
    public void bbb() {}
}

public class AnnotationTest1 {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.aaa();
        sub.bbb();
    }
}
