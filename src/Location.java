import java.util.*;

public class Location {
    protected String name;
    protected ArrayList<Road> roads;

    public Location(String name) {
        this.name = name;
        this.roads = new ArrayList<Road>();
    }
}