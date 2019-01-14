package FactoryMethod;

public class Factory {
    // 이렇게 객체를 생성하는 팩토리 메서드를 만들면 무슨 이점이 있는가?
    //
    // UserA, B, C .. 등 상당히 많은 곳에서 Product를 직접 생성한다고 할 경우,
    // 매번 new Product("food")와 같이 해줘야 한다.
    // 그런데 만약 생성자에food가 아닌 다른 값으로 변경해야 한다면?
    // UserA클래스는 물론이고 B,C,D,E,F ... 모두 직접 변경해야 한다.
    //
    // 따라서 이렇게 팩토리 메서드를 작성하면, 딱 한번 여기서 변경해주면 된다.
    public static Product getInstance() {
        return new Product("food");
    }
}
