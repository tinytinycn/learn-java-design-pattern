package memento;

/**
 * 该类的state状态被保存到memento中
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 保存操作
    public Memento setStateToMemento() {
        // 此时memento持有originator状态
        return new Memento(state);
    }

    // 获取备忘录历史的状态操作
    public String getStateFromMemento(Memento memento) {
        return memento.getState();
    }

}
