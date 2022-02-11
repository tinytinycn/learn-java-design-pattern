package template.worker;

public class ITWorker extends Worker{

    public ITWorker(String name) {
        super(name);
    }

    @Override
    protected void work() {
        System.out.println("开机-coding-调试-上线");
    }
}
