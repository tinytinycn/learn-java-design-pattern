package state.state;

/**
 * 每种状态下，相应的操作动作handle结果
 */
public interface State {
    //投币
    void insertMoney();

    // 退钱
    void backMoney();

    // 转动手柄
    void turnCrank();

    // 出商品
    void dispense();
}
