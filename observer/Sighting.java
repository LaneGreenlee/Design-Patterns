package observer;
import java.util.ArrayList;
/**
 * Class to create sightings of the cook for the cartel.
 * @author Laneag
 */
public class Sighting {
  
    private String location;
    private String details;
    private ArrayList<String> accomplices;

/**
 * Method called when a Sihgitng is instantiated.
 * @param location Where was the Cook?
 * @param details Whats the cook doing?
 * @param accomplices ArrayList of accomplices to the cook.
 */
    public Sighting(String location, String details, ArrayList<String> accomplices) {
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }

/**
 * Method called when location of the cook is needed
 * @return Location of cook
 */
    public String getLocation() {
        return this.location;
    }

/**
  * Method called when details of what the cook is upto are needed
  * @return What the cook is doing
  */
    public String getDetails() {
        return this.details;
    }

/**
 * Method called when Accomplices are needed
 * @return A string that holds the accomplices of the Cook.
 */
    public String getAccomplices() {
        return String.join(", ",accomplices);
    }

}
