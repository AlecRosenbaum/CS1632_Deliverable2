import static org.junit.Assert.*;
import org.junit.*;
import static org.mockito.Mockito.*;
import java.util.*;


public class LocationTest {

    // Re-usable Driver reference.
    Location _l;

    // Create a new LaboonCoin instance before each test.
    @Before
    public void setup() {
        _l = new Location("test_loc", 0);
    }

    // Assert that creating a new Driver instance
    // does not return a null reference
    @Test
    public void testLocationExists() {
        assertNotNull(_l);
    }

    // test that the name is set correctly
    @Test
    public void testName() {
        assertEquals(_l.name, "test_loc");
    }

    // test that roads is initialized to an empty arraylist.
    @Test
    public void testRoads() {
        assertEquals(_l.roads.size(), 0);
    }

    // test add_road. Add road should add a road object to
    // the protected location.roads arraylist
    @Test
    public void testAddRoad() {
        Road _r = mock(Road.class);
        _l.add_road(_r);
        assertEquals(_l.roads.size(), 1);
        assertEquals(_l.roads.get(0), _r);
    }

    // test get_rand_road when no roads have been added. get_rand_road should
    // return null.
    @Test
    public void testGetRandRoad_no_roads() {
        assertEquals(_l.get_rand_road(), null);
    }

    // test get_rand_road when a single road has been added. get_rand_road should
    // return that road.
    @Test
    public void testGetRandRoad_one_road() {
        Road _r = mock(Road.class);
        _l.add_road(_r);
        assertEquals(_l.get_rand_road(), _r);
    }

    // test get_rand_road will return a road specified by random.nextInt(#)
    @Test
    public void testGetRandRoad_two_roads() {
        Road _r1 = mock(Road.class);
        Road _r2 = mock(Road.class);
        _l.add_road(_r1);
        _l.add_road(_r2);
        
        // seed value of 0 always picks _r2
        assertEquals(_l.get_rand_road(), _r2);
    }

}
