package adapter;

public class V5PowerAdapter implements V5PowerTarget {

    private int v220power;

    public V5PowerAdapter(V220PowerAdaptee v220PowerAdaptee) {
        // 将v220家用电接入适配器
        v220power = v220PowerAdaptee.provideV220Power();
    }

    @Override
    public int provideV5Power() {
        System.out.println("经过一系列降压操作，将" + v220power + "家用电转为5v");
        return 5;
    }
}
