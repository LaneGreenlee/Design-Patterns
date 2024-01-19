package observer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Cook implements Subject {
    private String name;
    private ArrayList<Observer> observers;

    public Cook(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String location, String description, 
                                ArrayList<String> accomplices) {
        for(Observer observer : observers) {
            observer.update(location, description, accomplices);
        }
    }

    public void enterSighting(String location, String description, String accomplices) {
        String[] elements = accomplices.split(",");
        List<String> accompliceList = Arrays.asList(elements);
        ArrayList<String> listOfString = new ArrayList<String>(accompliceList);
        notifyObservers(location, description, listOfString);
    }

    public String getName() {
        return this.name;
    }

}
