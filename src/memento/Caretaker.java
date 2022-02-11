package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 历史的备忘录对象持有类
 */
public class Caretaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
