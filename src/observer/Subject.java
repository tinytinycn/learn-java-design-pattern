package observer;

/**
 * 目标专题
 */
public interface Subject {
    // 注册
    void registerObserver(Observer observer);
    // 移除
    void removeObserver(Observer observer);
    // 通知
    void notifyObservers();
}
