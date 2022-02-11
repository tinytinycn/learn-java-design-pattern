package mediator;

public interface User {

    // 绑定中介者，交互部分的逻辑交由中介者处理
    void setMediator(ChatRoomMediator chatRoomMediator);

    // colleague 只管发送消息
    void sendMsg(String msg);

    // colleague 只管接收消息
    void receiveMsg();

    String getName();

}
