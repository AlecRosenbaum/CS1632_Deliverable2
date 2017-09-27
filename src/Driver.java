public class Driver {
    protected Location curr_loc;

    /**
     * Create a new driver at a given location.
     *
     * @param starting_loc - starting location
     * @param seed - seed for random location picking
     * @return Driver - new driver instance
     */
    public Driver(Location starting_loc, int seed) {
        this.curr_loc = starting_loc;
    }

    /**
     * Randomly get the next location based on roads connected to the current location.
     *
     * @return Location - next location to visit
     */
    public Location get_next_loc() {
        // TODO
    }

    /**
     * Move along the given road to the new location.
     *
     * @param road - road to travel along
     * @return String - string representation of the movement.
     */
    public String move(Road road) {
        // move along road
        return "";
    }

    /**
     * randomly select a new location (limited to roads connected to current location),
     * then move there.
     *
     * @return String - string representation of the movement.
     */
    public String random_move() {
        // TODO
    }
}