import com.rtetdd.bowling.Scorer;

public class Reader {
    private Scorer scorer;
    private PinsMachine pinsMachine;
    public static final int NUMBER_MAX_OF_PINS = 10;

    public Reader(PinsMachine pinsMachine) {
        this.pinsMachine = pinsMachine;
    }

    public int getFallenPins() {
        return NUMBER_MAX_OF_PINS - pinsMachine.get_standing_pins();
    }
}
