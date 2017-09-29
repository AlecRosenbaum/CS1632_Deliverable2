public class Road {
    private Location from;
    private Location to;
    private String name;

    /**
     * Create a new road with the given properties. Note that all roads are one way.
     *
     * @param name - name of the road
     * @param from - origin of road
     * @param to - destination of road
     * @return Road - new road instance
     */
    public Road(String name, Location from, Location to) {
        this.name = name;
        this.from = from;
        this.to = to;
    }

    public Location getTo() {
        return this.to;
    }

    public Location getFrom() {
        return this.from;
    }

    public String getName() {
        return this.name;
    }

}
