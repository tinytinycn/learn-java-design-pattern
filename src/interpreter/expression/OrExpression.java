package interpreter.expression;

/**
 * 非终止解释器类，可以持有多个expression对象
 */
public class OrExpression implements AbstractExpression {

    private AbstractExpression expressionA;
    private AbstractExpression expressionB;

    public OrExpression(AbstractExpression expressionA, AbstractExpression expressionB) {
        this.expressionA = expressionA;
        this.expressionB = expressionB;
    }

    @Override
    public boolean interpret(String content) {
        // 传入带解析的content
        // 该解析器又组合了多个解析器
        return expressionA.interpret(content) || expressionB.interpret(content);
    }
}
