package adapter;

/**
 * Adaptee 适配者类
 */
public class V220PowerAdaptee {
    public int provideV220Power() {
        System.out.println("提供220v家用电");
        return 220;
    }
}
