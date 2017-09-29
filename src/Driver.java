import java.util.Random;

public class Driver {
    protected Location curr_loc;

    /**
     * Create a new driver at a given location.
     *
     * @param starting_loc - starting location
     * @param seed - seed for random location picking
     * @return Driver - new driver instance
     */
    public Driver(Location starting_loc) {
        this.curr_loc = starting_loc;
    }


    /**
     * Move along the given road to the new location.
     *
     * @param road - road to travel along
     * @return String - string representation of the movement.
     */
    public String move(Road road) {
        // move along road
        String ret_str = "heading from " + curr_loc.name + " to " + road.getTo().name + " via " + road.getName() + ".";
        curr_loc = road.getTo();
        return ret_str;
    }

    /**
     * randomly select a new location (limited to roads connected to current location),
     * then move there.
     *
     * @return String - string representation of the movement.
     */
    public String random_move() {
        return this.move(this.curr_loc.get_rand_road());
    }
}