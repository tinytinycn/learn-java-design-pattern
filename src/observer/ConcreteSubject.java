package observer;

import java.util.ArrayList;

/**
 * 被观察的实际目标
 */
public class ConcreteSubject implements Subject {

    //保存注册的observer观察者
    private ArrayList<Observer> observers = new ArrayList<>();

    //实际目标的状态值subjectState
    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    /**
     * 更新实际目标的状态，调用notify通知所有观察者，并调用其相应的update操作函数
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
