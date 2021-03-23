public class View {

    Screen screen;

    public View(Screen screen) {
        this.screen = screen;
    }

    public void show(String message) {
        this.screen.show(message);
    }
}
