package state.state;

import state.Machine;

import java.util.Random;

/**
 * 已投币状态
 */
public class HasMoneyState implements State {
    private Machine machine;

    public HasMoneyState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("已经投过币了,不用再投了");
    }

    @Override
    public void backMoney() {
        System.out.println("退币成功");
    }

    @Override
    public void turnCrank() {
        System.out.println("转动手柄");
        int winner = new Random().nextInt(10);
        if (winner == 0 && machine.getCount() > 1) {
            machine.changeState(machine.getWinnerState());
        } else {
            machine.changeState(machine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("只有在 售出商品状态时才能出货");
    }
}
