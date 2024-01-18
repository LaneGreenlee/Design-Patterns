package observer;
import java.util.ArrayList;

public class Cook implements Subject{
    private String name;
    private ArrayList<Observer> observers;

    public Cook(String name) {
        this.name = name;
    }

    public void registerObserver(Observer observer) {

    }
    public void removeObserver(Observer observer) {

    }
    public void notifyObservers(String location, String description, 
                                ArrayList<String> accomplices) {
        
    }

    public void enterSighting(String location, String description, String accomplices) {

    }

    public String getName() {
        return this.name;
    }
}
