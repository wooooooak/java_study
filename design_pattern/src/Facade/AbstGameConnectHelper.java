package Facade;

public abstract class AbstGameConnectHelper {
  protected abstract String doSecurity(String string);

  protected abstract boolean authentication(String id, String password);

  protected abstract int authorization(String userName);

  protected abstract String connection(String info);

  // 템플릿 메서드
  public String requestConnection(String str) {

    // 보안 작업 -> 암호화 된 문자열을 복호화
    String encodedInfo = "encoded_info";
    String decodedInfo = doSecurity(encodedInfo);

    // 반ㅁ환된 것을 가지고 아이디, 암호를 할당한다.
    String id = "aaa";
    String password = "bbb";

    if (!authentication(id, password)) {
      throw new Error("아이디 암호 불일치");
    }

    String userName = "userName";
    int i = authorization(userName);

    switch (i) {
      case 0: // 게임 메니저
        break;
      case 1:
        break;
      default: // 기타사항
        break;


    }
    return connection(decodedInfo);
  }
}