package observer;

/**
 * 实际观察者B
 */
public class ConcreteObserverB implements Observer {
    // 可以在构建观察者对象时，进行注册
    public ConcreteObserverB(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("观察者B 得到目标subject通知的信息: " + msg);
    }
}
