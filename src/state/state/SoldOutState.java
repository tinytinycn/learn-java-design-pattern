package state.state;

import state.Machine;

/**
 * 售空状态
 */
public class SoldOutState implements State {
    private Machine machine;

    public SoldOutState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("禁止投币，商品已经售空");
    }

    @Override
    public void backMoney() {
        System.out.println("禁止操作");
    }

    @Override
    public void turnCrank() {
        System.out.println("禁止操作");
    }

    @Override
    public void dispense() {
        System.out.println("禁止操作");
    }
}
