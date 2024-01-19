package observer;
import java.util.ArrayList;

public class Cartel implements Observer{
     public Subject cook;
     public ArrayList<Sighting> sightings;

     public Cartel(Subject cook) {
        this.cook = cook;
        cook.registerObserver(this);
        sightings = new ArrayList<Sighting>();
     }

     public void update(String location, String description, ArrayList<String> accomplices) {
        Sighting s = new Sighting(location, description, accomplices);
        sightings.add(s);
     }

     public String getLog() {
        String returnString = "";
        for(Sighting s : sightings) {
            returnString += s.getLocation()+" ("+s.getDetails()+"), with "+s.getAccomplices()+"\n";
        }
        return returnString;
     }
}
