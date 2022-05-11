package designpattern.facade;

public class HomeTheaterFacade {

    private DvdPlayer dvdPlayer;

    private Screen screen;

    public HomeTheaterFacade() {
        dvdPlayer = DvdPlayer.getInstance();
        screen = Screen.getInstance();
    }

    public void start() {
        screen.open();
        dvdPlayer.on();
    }

    public void end() {
        screen.close();
        dvdPlayer.off();
    }
}
