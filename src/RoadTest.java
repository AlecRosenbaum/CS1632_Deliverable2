import static org.junit.Assert.*;
import org.junit.*;
import static org.mockito.Mockito.*;

public class RoadTest {

    // Re-usable Driver reference.
    Location _from;
    Location _to;
    Road _r;

    // Create a new LaboonCoin instance before each test.
    @Before
    public void setup() {
        _from = mock(Location.class);
        _to = mock(Location.class);
        _r = new Road("test_road", _from, _to);
    }

    // Assert that creating a new Driver instance
    // does not return a null reference
    @Test
    public void testLocationExists() {
        assertNotNull(_r);
    }

    // Make sure "name" field is set correctly
    @Test
    public void testGetName() {
        assertEquals(_r.getName(), "test_road");
    }

    // Make sure "to" field is set correctly
    @Test
    public void testGetTo() {
        assertEquals(_r.getTo(), _to);
    }

    // Make sure "from" field is set correctly
    @Test
    public void testGetFrom() {
        assertEquals(_r.getFrom(), _from);
    }

}
