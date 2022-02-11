package mediator;

public class ChatRoom implements ChatRoomMediator {
    @Override
    public void registerUser(User user) {
        user.setMediator(this);
    }

    @Override
    public void showMessage(User user, String msg) {
        System.out.println("User-" + user.getName() + "send a msg, content: " + msg);
    }
}
