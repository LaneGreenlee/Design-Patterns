package observer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class cook to implementy the Subject interface. This is
 * the class that will be obersved by adjacent classes, and is the
 * base class to keep track of the cook. 
 * @author Laneag
 */
public class Cook implements Subject {
    private String name;
    private ArrayList<Observer> observers;

    /**
     * Method invoked when the type Cook is instantiated.
     * Sets name of cook and reserves memory for the Observers.
     * @param name Name of the cook.
     */
    public Cook(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
     * Method to register an Observer.
     * @param observer The observer to be registered.
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    /**
     * Method to remove a registered observer.
     * @param observer Observer to be removed.
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * method to notify the observers when there is a change in what
     * the Cook is doing. Calls an update class which behaves differntly
     * for different observers.
     * @param location Where the Cook is located.
     * @param description What the cook is doing.
     * @param accomplices ArrayList of accomplices to the Cook.
     */
    public void notifyObservers(String location, String description, 
                                ArrayList<String> accomplices) {
        for(Observer observer : observers) {
            observer.update(location, description, accomplices);
        }
    }

    /**
     * Method to submit a sighting of the cook. 
     * @param location Where the cook is.
     * @param description What the cook is doing.
     * @param accomplices String representation of the accomplices to the cook.
     */
    public void enterSighting(String location, String description, String accomplices) {
        String[] elements = accomplices.split(", ");
        List<String> accompliceList = Arrays.asList(elements);
        ArrayList<String> listOfString = new ArrayList<String>(accompliceList);
        notifyObservers(location, description, listOfString);
    }

    /**
     * Method to get the name of the cook.
     * @return The name of the Cook.
     */
    public String getName() {
        return this.name;
    }

}
