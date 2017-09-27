import static org.junit.Assert.*;
import org.junit.*;

public class DriverTest {

    // Re-usable Driver reference.
    Location _l;
    Driver _d;

    // Create a new LaboonCoin instance before each test.
    @Before
    public void setup() {
        _l = new Location("test_loc");
        _d = new Driver(_l, 0);
    }

    // Assert that creating a new Driver instance
    // does not return a null reference
    @Test
    public void testDriverExists() {
        assertNotNull(_d);
    }

    // Some comment for what im doing
    @Test
    public void testSomething() {
        assertEquals("", "");
    }

}
