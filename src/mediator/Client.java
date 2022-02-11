package mediator;

public class Client {
    void test() {
        // 创建一个中介者
        ChatRoom chatRoom = new ChatRoom();
        // 创建两个colleague
        UserA userA = new UserA("tinyA");
        UserB userB = new UserB("tinyB");
        // colleague绑定到中介者
        userA.setMediator(chatRoom);
        userB.setMediator(chatRoom);
        //  colleague进行自己的操作，不用管交互部分的逻辑细节
        userA.sendMsg("haha");
        userB.sendMsg("hehe");
    }
}
