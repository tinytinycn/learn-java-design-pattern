package mediator;

public class UserA implements User {

    private String name;

    private ChatRoomMediator chatRoomMediator;

    public UserA(String name) {
        this.name = name;
    }

    @Override
    public void sendMsg(String msg) {
        System.out.println("发送消息到聊天室");
        chatRoomMediator.showMessage(this, msg);
    }

    @Override
    public void receiveMsg() {
        System.out.println("接收到来自聊天室的消息");
        // do something...
    }

    @Override
    public void setMediator(ChatRoomMediator chatRoomMediator) {
        this.chatRoomMediator = chatRoomMediator;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
