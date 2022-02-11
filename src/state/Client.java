package state;

public class Client {
    void test() {
        Machine machine = new Machine(3);
        // 用户投币了
        machine.insertMoney();
        // 用户摇动手柄了
        machine.turnCrank();
    }
}
