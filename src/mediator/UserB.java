package mediator;

public class UserB implements User {
    private String name;

    private ChatRoomMediator chatRoomMediator;

    public UserB(String name) {
        this.name = name;
    }

    @Override
    public void sendMsg(String msg) {

    }

    @Override
    public void receiveMsg() {

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
