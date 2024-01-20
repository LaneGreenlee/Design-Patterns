package observer;
import java.util.ArrayList;

public class Police implements Observer {
    private Subject cook;
    private ArrayList<String> locations;
    private String notes = "";
    private ArrayList<String> people;

    public Police(Subject cook) {
        locations = new ArrayList<String>();
        people = new ArrayList<String>();
        this.cook = cook;
        cook.registerObserver(this);
    }

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
