package observer;
import java.util.ArrayList;

/**
 * Class to implement the Observer interface in the form of the Cartel.
 * Class tracks heisenburg and his whereabouts.
 * @author Laneag
 */
public class Cartel implements Observer{
     public Subject cook;
     public ArrayList<Sighting> sightings;

     /**
      * Method invoked when a new Cartel Object is created
      * @param cook The cook designated by the user.
      */
     public Cartel(Subject cook) {
        this.cook = cook;
        cook.registerObserver(this);
        sightings = new ArrayList<Sighting>();
     }

    /**
     * Method to add a new sighting of the cook with background info
     * on who he's with, what hes doing, and where he is. More specific 
     * than update method in Police class.
     * @param location String description of the location of the cook.
     * @param description String description of what the cook is doing.
     * @param accomplices ArrayList of accomplices that the cook was with.
     */
     public void update(String location, String description, ArrayList<String> accomplices) {
        Sighting s = new Sighting(location, description, accomplices);
        sightings.add(s);
     }

    /**
     * Method to iterate through the sightings of the cook and return them
     * in a readable fashion.
     * @return A String representation of all the sightings of the cook.
     */
     public String getLog() {
        String returnString = "";
        for(Sighting s : sightings) {
            returnString += s.getLocation()+" ("+s.getDetails()+"), with "+s.getAccomplices()+"\n";
        }
        return returnString;
     }
}
