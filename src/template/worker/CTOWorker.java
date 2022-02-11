package template.worker;

public class CTOWorker extends Worker{
    public CTOWorker(String name) {
        super(name);
    }

    @Override
    protected void work() {
        System.out.println("开发-制定kpi-检查各项工作进度");
    }
}
