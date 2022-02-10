package facade;

public class Client {
    public void watch() {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new SubSystemPlayer(), new SubSystemLight());
        homeTheaterFacade.watchMovie();
        // ....long time
        homeTheaterFacade.stopMovie();
    }
}
