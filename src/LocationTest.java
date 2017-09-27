import static org.junit.Assert.*;
import org.junit.*;

public class LocationTest {

    // Re-usable Driver reference.
    Location _l;

    // Create a new LaboonCoin instance before each test.
    @Before
    public void setup() {
        _l = new Location("test_loc");
    }

    // Assert that creating a new Driver instance
    // does not return a null reference
    @Test
    public void testLocationExists() {
        assertNotNull(_l);
    }

    // Some comment for what im doing
    @Test
    public void testSomething() {
        assertEquals("", "");
    }

}
