package memento;

public class Client {

    void test() {
        // 创建备忘录管理（持有taker）类
        Caretaker caretaker = new Caretaker();
        // 创建原始类对象
        Originator originator = new Originator();
        originator.setState("state #1");
        originator.setState("state #2");

        // 保存, 首先将状态state保存至memento，再记录到caretaker
        caretaker.add(originator.setStateToMemento());

        originator.setState("state #3");
        // 保存, 首先将状态state保存至memento，再记录到caretaker
        caretaker.add(originator.setStateToMemento());

        originator.setState("state #4");

        // 获取当前状态
        System.out.println("当前状态: " + originator.getState());
        // 获取历史状态
        System.out.println("历史状态" + originator.getStateFromMemento(caretaker.get(0)));
        System.out.println("历史状态" + originator.getStateFromMemento(caretaker.get(1)));

    }
}
