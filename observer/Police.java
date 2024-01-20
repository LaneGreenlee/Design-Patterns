package observer;
import java.util.ArrayList;

/**
 * Class to implement the Observer interface for type Police. 
 * @author Laneag
 */
public class Police implements Observer {
    private Subject cook;
    private ArrayList<String> locations;
    private String notes = "";
    private ArrayList<String> people;

/**
 * Method called when an Object of Police is
 * instantiated.
 * @param cook The cook to be observed
 */
    public Police(Subject cook) {
        locations = new ArrayList<String>();
        people = new ArrayList<String>();
        this.cook = cook;
        cook.registerObserver(this);
    }

/**
 * Implementation of abtract method update to register a sighting of the cook.
 * Builds the String represenation Notes of what He's doing.
 * @param location Where is the cook.
 * @param decription What's the cook doing
 * @param accomplices ArrayList of the accomplices to the Cook. 
 */
    public void update(String location, String description, ArrayList<String> accomplices) {
        locations.add(location);
        notes += "- "+description+"\n";
        for (String a : accomplices){
            if(people.contains(a))
                continue;
            else
                people.add(a);
        }
    }

/**
 * Method to build and return a String representation of the Cook's 
 * Whereabouts that the police know of.
 * @return A string representation of the Cook's whereabouts.
 */
    public String getLog(){
        String returnString = "Locations:\n";
        for (String location : locations) {
            returnString +="- "+location+"\n";
        }
        returnString+="\nNotes:\n"+notes;
        returnString+="\nAccomplices:\n";
        for (String p : people) {
            returnString+="- "+p+"\n";
        }
        return returnString;
    }
}
