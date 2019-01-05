package LangPackage;

/*
    문자열과 관련된 String, StringBuffer, StringBuilder도 모두 java.lang패키지

    오토박싱(Auto Boxing),오토 언박싱(Auto unboxing) 은 JAVA 5부터 지원한다. 이 때 내부적으로 Wrapper클래스들이 사용된다.
*/
public class WrapperExam {
    public static void main(String[] args) {
        int i = 5;
        Integer i2 = new Integer(5);
        Integer i3 = 5; // 오토박싱 됨

        int i4 = i2.intValue();
        int i5 = i2; // 오토 언박싱
    }
}
