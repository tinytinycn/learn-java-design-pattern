package observer;

public class Client {
    public void test() {
        // 创建被观察的目标subject
        ConcreteSubject concreteSubject = new ConcreteSubject();
        // 创建观察者，并在构造器中完成注册，否则通过subject.registerObserver()进行注册
        ConcreteObserverA concreteObserverA = new ConcreteObserverA(concreteSubject);
        ConcreteObserverB concreteObserverB = new ConcreteObserverB(concreteSubject);
        // 变更目标subject的状态state：msg
        concreteSubject.setMsg("AAA");
        concreteSubject.setMsg("BBB");
    }
}
