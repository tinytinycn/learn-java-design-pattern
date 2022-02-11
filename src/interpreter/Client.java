package interpreter;

import interpreter.expression.AndExpression;
import interpreter.expression.OrExpression;
import interpreter.expression.TerminalExpression;

public class Client {
    void test() {
        // 构建规则
        TerminalExpression jingbin = new TerminalExpression("aaa");
        TerminalExpression youlookwhat = new TerminalExpression("bbb");
        OrExpression firstExpression = new OrExpression(jingbin, youlookwhat);// 找到条件 aaa 或者 bbb 即可的解释器
        System.out.println("找到了 aaa 或 bbb 了吗：" + firstExpression.interpret("A aaa"));

        // 构建规则
        TerminalExpression julie = new TerminalExpression("tiny");
        TerminalExpression married = new TerminalExpression("tiny");
        AndExpression secondExpression = new AndExpression(julie, married);
        System.out.println("找了 tiny tiny 了吗：" + secondExpression.interpret("tinytinycn"));
    }
}
