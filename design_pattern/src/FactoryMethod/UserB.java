package FactoryMethod;

public class UserB {
    public void doSomething() {
        Product p = Factory.getInstance();
    }
}
