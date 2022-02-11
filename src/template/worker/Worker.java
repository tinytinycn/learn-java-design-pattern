package template.worker;

public abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    // 公共部分的具体方法，定义了实现算法的骨架，不允许修改
    public final void workOneDay() {
        System.out.println("开始工作");

        // 暴露抽象方法，留给子类实现
        work();

        System.out.println("结束工作");
    }

    protected abstract void work();
}
