package observer;
import java.util.ArrayList;
/**
 * @author Laneag
 * Observer interface that extends Subject interface.
 */

 public interface Observer {
    public void update(String location, String description, ArrayList<String> accomplices>);
    public String getLog();
 }