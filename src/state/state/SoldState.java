package state.state;

import state.Machine;

/**
 * 售卖状态
 */
public class SoldState implements State {
    private Machine machine;

    public SoldState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("正在出货，请勿投币");
    }

    @Override
    public void backMoney() {
        System.out.println("正在出货，无法退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("正在出货，无法摇动手柄");
    }

    @Override
    public void dispense() {
        machine.dispense();
        if (machine.getCount() > 0) {
            machine.changeState(machine.getNoMoneyState());
        } else {
            machine.changeState(machine.getSoldOutState());
        }
    }
}
