package facade;

/**
 * 家庭影院外观类
 * 封装了对影院设备的操作
 */
public class HomeTheaterFacade {
    private SubSystemPlayer player;
    private SubSystemLight light;

    public HomeTheaterFacade(SubSystemPlayer player, SubSystemLight light) {
        this.player = player;
        this.light = light;
    }

    public void watchMovie() {
        player.on();
        light.down();
        player.make3DListener();
    }

    public void stopMovie() {
        player.off();
        light.up();
    }
}
