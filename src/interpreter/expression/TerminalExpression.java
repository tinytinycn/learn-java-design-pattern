package interpreter.expression;

/**
 * 必须要有一个终止解释器类
 */
public class TerminalExpression implements AbstractExpression {

    private String conditional;

    public TerminalExpression(String conditional) {
        this.conditional = conditional;
    }

    @Override
    public boolean interpret(String content) {
        // 是否包含
        return content.contains(conditional);
    }
}
