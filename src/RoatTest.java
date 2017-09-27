import static org.junit.Assert.*;
import org.junit.*;

public class RoadTest {

    // Re-usable Driver reference.
    Location _from;
    Location _to;
    Road _r;

    // Create a new LaboonCoin instance before each test.
    @Before
    public void setup() {
        _from = new Location("from");
        _to = new Location("to");
        _r = new Road("test_road", _from, _to);
    }

    // Assert that creating a new Driver instance
    // does not return a null reference
    @Test
    public void testLocationExists() {
        assertNotNull(_r);
    }

    // Some comment for what im doing
    @Test
    public void testSomething() {
        assertEquals("", "");
    }

}
