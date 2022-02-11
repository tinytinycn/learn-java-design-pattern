package strategy;

import strategy.strategy.DisplayBehaviorA;
import strategy.strategy.DisplayBehaviorB;

public class Client {
    void test() {
        RoleA roleA = new RoleA("AAA");
        roleA.setIDisplayBehavior(new DisplayBehaviorA());
        roleA.display();

        RoleA roleA2 = new RoleA("AAa");
        roleA2.setIDisplayBehavior(new DisplayBehaviorB());
        roleA2.display();
    }
}
