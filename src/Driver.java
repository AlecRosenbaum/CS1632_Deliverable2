import java.util.Random;

public class Driver {
    protected Location curr_loc;
    private Random random;

    /**
     * Create a new driver at a given location.
     *
     * @param starting_loc - starting location
     * @param seed - seed for random location picking
     * @return Driver - new driver instance
     */
    public Driver(Location starting_loc, int seed) {
        this.curr_loc = starting_loc;
        this.random = new Random(seed);
    }

    /**
     * Randomly get a road connected to the current location.
     *
     * @return Road - a random road connected to the current location
     */
    public Road get_rand_road() {
        return curr_loc.roads.get(this.random.nextInt(curr_loc.roads.size()));
    }

    /**
     * Move along the given road to the new location.
     *
     * @param road - road to travel along
     * @return String - string representation of the movement.
     */
    public String move(Road road) {
        // move along road
        String ret_str = "heading from " + curr_loc.name + " to " + road.to.name + " via " + road.name + ".";
        curr_loc = road.to;
        return ret_str;
    }

    /**
     * randomly select a new location (limited to roads connected to current location),
     * then move there.
     *
     * @return String - string representation of the movement.
     */
    public String random_move() {
        return this.move(this.get_rand_road());
    }
}