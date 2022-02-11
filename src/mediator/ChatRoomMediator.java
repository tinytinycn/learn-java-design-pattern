package mediator;

public interface ChatRoomMediator {

    void registerUser(User user);

    // 中介者完成内部交互的细节
    void showMessage(User user, String msg);
}
