package observer;

/**
 * 观察者，所有观察者实现该接口
 */
public interface Observer {
    // 观察者监听到目标变化，进行相应的update操作
    void update(String msg);
}
