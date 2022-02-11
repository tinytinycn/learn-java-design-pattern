package template;

import template.worker.CTOWorker;
import template.worker.ITWorker;

public class Client {
    void test() {
        CTOWorker cto = new CTOWorker("laoban");
        cto.workOneDay();
        ITWorker itWorker = new ITWorker("manong");
        itWorker.workOneDay();
    }
}
