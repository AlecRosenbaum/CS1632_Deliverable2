import java.util.*;

public class Location {
    protected String name;
    protected ArrayList<Road> roads;

    public Location(String name) {
        this.name = name;
        this.roads = new ArrayList<Road>();
    }

    /**
     * Adds a road to the list of connected roads.
     *
     * @param road - the road to add to the connected road list
     */
    public void add_road(Road road) {
        this.roads.add(road);
    }
}