import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReaderTests {
    Reader reader;
    StubPinsMachine stubMachine;

    @Before
    public void Setup() {
        stubMachine = new StubPinsMachine();
        reader = new Reader(stubMachine);
    }

    //le Reader renvoit le nombre de quilles tombées
    //le PinsMachine renvoit le nombre de quilles debout
    @Test
    public void test_return_0pin_fallen_when_10_pins_standing() {
        stubMachine.setNumberOfStandingPins(10);
        Assert.assertEquals(0, reader.getFallenPins());
    }
}
