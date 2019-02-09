public class DefaultGameConnectHelper extends AbstGameConnectHelper {
    @Override
    protected String doSecurity(String string) {
        System.out.println("디코드");
        return true;
    }

    @Override
    protected boolean authentication(String id, String password) {
        return true;
    }

    @Override
    protected int authorization(String userName) {
        return 0;
    }

    @Override
    protected Stiring connection(String info) {
        System.out.println("마지막 접속 단계");
        return info;
    }
}