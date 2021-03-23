import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ViewTest extends TestCase {

    View view;
    MockScreen mockScreen;

    @Before
    public void Setup() {
        mockScreen = new MockScreen();
        view = new View(mockScreen);
    }

    @Test
    public void test_show_score() {
        view.show("Player: Toto");
        Assert.assertEquals("player: Toto", mockScreen.getOutputMessage());
        Assert.assertEquals(1, mockScreen.getCounter());
    }
}