import java.util.Random;

public class CitySim9005 {

    
    /**
     * Helper function to create a road connecting to locations, then add the road to the
     * city's road list
     *
     * @param road_name
     * @param from
     * @param to
     * @return Road - new road connecting the location
     */
    private static Road connect_locations(String road_name, Location from, Location to) {
        Road road = new Road(road_name, from, to);
        from.add_road(road);
        return road;
    }

    public static void main(String[] args) {
        // read args
        int rand_seed;
        try {
            if (args.length != 1) {
                throw new Exception("Incorrect Number of Args");
            }

            rand_seed = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Please enter one integer argument.");
            return;
        }
        
        // initialize random
        Random random = new Random(rand_seed);

        // construct city locations
        Location philadelphia = new Location("Outside City");
        Location cleveland = new Location("Outside City");
        Location hotel = new Location("Hotel");
        Location diner = new Location("Diner");
        Location library = new Location("Library");
        Location coffee = new Location("Coffee");
        Location[] starting = {hotel, diner, library, coffee};


        // create all of the roads
        connect_locations("Fourth Ave", hotel, diner);
        connect_locations("Fourth Ave", diner, philadelphia);
        connect_locations("Fifth Ave", coffee, library);
        connect_locations("Fifth Ave", library, cleveland);
        connect_locations("Bill St", library, hotel);
        connect_locations("Bill St", hotel, library);
        connect_locations("Phil St", diner, coffee);
        connect_locations("Phil St", coffee, diner);

        // for 5 drivers (note: sample number 1-5, not 0-4)
        for (int i = 1; i < 6; i++) {
            Driver curr_driver = new Driver(starting[random.nextInt(4)], rand_seed);
            // run until they leave the city
            while (curr_driver.curr_loc != philadelphia && curr_driver.curr_loc != cleveland) {
                System.out.println("Driver " + i + " " + curr_driver.random_move());
            }
            if (curr_driver.curr_loc == philadelphia) {
                System.out.println("Driver " + i + " has gone to Philadelphia!");
            } else {
                System.out.println("Driver " + i + " has gone to Cleveland!");
            }
            System.out.println("-----");
        }
    }
}
