package observer;

/**
 * 实际观察者A
 */
public class ConcreteObserverA implements Observer {

    // 可以在构建观察者对象时，进行注册
    public ConcreteObserverA(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("观察者A 得到目标subject通知的信息: " + msg);
    }
}
