public class City extends Place implements Local, Statistical, Transportation {

    // Populate this class with the fields and the methods necessary to
    // fulfill the implemented interfaces.

    // name of city
    private String name;

    // type of climate
    private String climate;

    // city population
    private int population;

    // airport boolean
    private boolean hasAirport;

    // name of airport
    private String nameOfAirport;

    // harbor boolean
    private boolean hasHarbor;

    // name of harbor
    private String nameOfHarbor;

    // train station boolean
    private boolean hasTrainStation;

    // name of train station
    private String nameOfTrainStation;

    // bus service boolean
    private boolean hasBusService;

    // subway network boolean
    private boolean hasSubwayNetwork;


    // method describeClimate prints city climate
    public String describeClimate() {
        // print climate info ⤵︎
        System.out.println(name + "'s climate is " + climate + ".");
        return climate;
    } // method describeClimate

    // method population prints city population
    public int population() {
        // print city population ⤵︎
        System.out.println(name + "'s population is " + population + ".");
        return population;
    } // method population

    // method hasAirport returns if city has an airport
    public boolean hasAirport() {
        if (hasAirport) { // if city has an airport ⤵︎
            System.out.println(name + " has an airport.");
        }
        else { // if not ⤵︎
            System.out.println(name + " has a no airport.");
        }
        return hasAirport;
    } // method hasAirport

    // method nameOfAirport prints airport name
    public String nameOfAirport() {
        if (hasAirport) { // if city has an airport ⤵︎
            System.out.println(name + "'s airport is " + nameOfAirport + ".");
        }
        else { // if not ⤵︎
            System.out.println(name + " has a no airport.");
        }
        return nameOfAirport;
    } // method nameOfAirport

    // method hasHarbor returns if city has a harbor
    public boolean hasHarbor() {
        if (hasHarbor) { // if city has a harbor ⤵︎
            System.out.println(name + " has a harbor.");
        }
        else { // if not ⤵︎
            System.out.println(name + " has no harbor.");
        }
        return hasHarbor;
    } // method hasHarbor

    // method nameOfHarbor prints harbor name
    public String nameOfHarbor() {
        if (hasHarbor) { // if city has a harbor ⤵︎
            System.out.println(name + "'s harbor is " + nameOfHarbor + ".");
        }
        else { // if not ⤵︎
            System.out.println(name + " has no harbor.");
        }
        return nameOfHarbor;
    } // method nameOfHarbor

    // method hasTrainStation returns if city has a train station
    public boolean hasTrainStation() {
        if (hasTrainStation) { // if city has a train station ⤵︎
            System.out.println(name + "'s train station is called" + nameOfTrainStation + ".");
        }
        else { // if not ⤵︎
            System.out.println(name + " has no train station.");
        }
        return hasTrainStation;
    } // method hasTrainStation

    // method hasTrainStation prints train station name
    public String nameOfTrainStation() {
        if (hasTrainStation) { // if city has a train station ⤵︎
            System.out.println(name + " has a train station.");
        }
        else { // if not ⤵︎
            System.out.println(name + " has no train station.");
        }
        return nameOfTrainStation;
    } // method nameOfTrainStation

    // method hasBusService returns if city has a bus service
    public boolean hasBusService() {
        // if there is no bus service
        if (hasBusService) { // if city has bus service ⤵︎
            System.out.println(name + " has a bus service.");
        }

        else { // if not ⤵︎
            System.out.println(name + " has no bus service.");
        }
        return hasBusService;
    } // method hasBusService

    // method hasSubwayNetwork returns if city has a subway network
    public boolean hasSubwayNetwork() {
        if (hasSubwayNetwork) { // if city has subway network ⤵︎
            System.out.println(name + " has a subway network.");
        }
        else { // if not ⤵︎
            System.out.println(name + " has no subway network.");
        }
        return hasSubwayNetwork;
    } // method hasSubwayNetwork

    // method describeCity describes city
    public void describeCity() {
        System.out.println(name + " information: \n");
        describeClimate();
        population();
        nameOfAirport();
        nameOfTrainStation();
        nameOfHarbor();
        hasSubwayNetwork();
        hasBusService();
        System.out.println("\n");
    } // method describeCity

    public static void main(String[] args) {
        City Chicago = new City();
        Chicago.name = "Chicago";
        Chicago.population = 2697000;
        Chicago.setLongitude(41.8781);
        Chicago.setLatitude(87.6298);
        Chicago.setElevation(597);
        Chicago.hasAirport = true;
        Chicago.nameOfAirport = "O'Hare International Airport";
        Chicago.hasSubwayNetwork = false;
        Chicago.hasTrainStation = true;
        Chicago.nameOfTrainStation = "The Loop";
        Chicago.hasHarbor = true;
        Chicago.nameOfHarbor = "Belmont Harbor";
        Chicago.hasBusService = true;
        Chicago.climate = "continental";
        Chicago.describeCity();
    } // method main
}  // class City