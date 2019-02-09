package FactoryMethod;

public class UserA {
//    public void doSomethind() {
//        Product p = new Product("food");
//    }

    // 직접적으로 객체를 Food 객체를 생성하지 않는다.
    public void doSomething() {
        Product p = Factory.getInstance();
    }
}
