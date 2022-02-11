package state;

import state.state.HasMoneyState;
import state.state.NoMoneyState;
import state.state.SoldOutState;
import state.state.SoldState;
import state.state.State;
import state.state.WinnerState;

/**
 * 拥有多个状态state的售卖机对象
 */
public class Machine {
    private int count = 0;
    private State currentState;
    //中奖状态
    private State winnerState;
    //未投币状态
    private State noMoneyState;
    //已投币状态
    private State hasMoneyState;
    //售卖状态
    private State soldState;
    //售空状态
    private State soldOutState;

    public Machine(int count) {

        // 创建多个状态
        winnerState = new WinnerState(this);
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);

        if (count > 0) {
            // 初始化售卖商品数量
            this.count = count;
            // 初始化售卖机当前状态
            this.currentState = noMoneyState;
        }
    }

    // 投币
    public void insertMoney() {
        currentState.insertMoney();
    }

    // 退币
    public void backMoney() {
        currentState.backMoney();
    }

    // 转动手柄
    public void turnCrank() {
        currentState.turnCrank();
    }

    // 出商品
    public void dispense() {
        System.out.println("售卖机发出商品");
        if (count > 0) {
            count--;
        }
    }

    // 变更售卖机状态
    public void changeState(State state) {
        this.currentState = state;
    }

    public int getCount() {
        return count;
    }

    public State getCurrentState() {
        return currentState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }
}
