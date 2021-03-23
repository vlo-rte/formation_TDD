public class StubPinsMachine implements PinsMachine {

    private int numberOfStandingPins;

    public int get_standing_pins(){
        return this.numberOfStandingPins;
    }

    public void setNumberOfStandingPins(int numberOfStandingPins) {
        this.numberOfStandingPins = numberOfStandingPins;
    }
}