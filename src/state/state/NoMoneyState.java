package state.state;

import state.Machine;

/**
 * 未投币
 */
public class NoMoneyState implements State {
    private Machine machine;

    public NoMoneyState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("投币成功");
        machine.changeState(machine.getHasMoneyState());
    }

    @Override
    public void backMoney() {
        System.out.println("未投币，没有币可以退还");
    }

    @Override
    public void turnCrank() {
        System.out.println("请投币后，在摇动手柄");
    }

    @Override
    public void dispense() {
        System.out.println("请中奖后，出货商品");
    }
}
