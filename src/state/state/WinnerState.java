package state.state;

import state.Machine;

/**
 * 中奖状态，实现相应动作handle操作的结果
 */
public class WinnerState implements State {
    private Machine machine;

    public WinnerState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("非法操作");
    }

    @Override
    public void backMoney() {
        System.out.println("非法操作");
    }

    @Override
    public void turnCrank() {
        System.out.println("非法操作");
    }

    @Override
    public void dispense() {
        // 中奖状态，可以出商品
        System.out.println("中奖啦，恭喜你获得2件商品");
        // 第一件
        machine.dispense();
        if (machine.getCount() == 0) {
            System.out.println("商品已售空，中奖失效");
            machine.changeState(machine.getSoldOutState());
        } else {
            // 第二件
            machine.dispense();
            if (machine.getCount() > 0) {
                machine.changeState(machine.getNoMoneyState());
            } else {
                machine.changeState(machine.getSoldState());
            }
        }
    }
}
