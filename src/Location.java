import java.util.*;

public class Location {
    protected String name;
    protected ArrayList<Road> roads;
    private Random random;

    public Location(String name, int seed) {
        this.name = name;
        this.random = new Random(seed);
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

    /**
     * Randomly get a road. If location has no roads, return null.
     *
     * @return Road - a random road connected to the current location (or null)
     */
    public Road get_rand_road() {
        if (roads.size() == 0) {
            return null;
        }

        return this.roads.get(this.random.nextInt(this.roads.size()));
    }
}