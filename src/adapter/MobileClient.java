package adapter;

/**
 * Client 客户类，最终使用适配器adapter的客户
 */
public class MobileClient {

    public void inputPower(V5PowerTarget v5PowerTarget) {
        int v5Power = v5PowerTarget.provideV5Power();
        System.out.println("手机客户端需要使用5V电压，当前电压: " + v5Power + "V.");
    }
}
