package Exception;

public class MyException extends Exception {
    private final String msg = "0~100 사이의 값만 입력 가능";

    @Override
    public String getLocalizedMessage() {
        return msg;
    }
}
