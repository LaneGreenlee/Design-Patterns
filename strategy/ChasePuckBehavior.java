package strategy;

/**
 * Class to implement a chase puck defense behavior
 * @author Laneag
 */
public class ChasePuckBehavior implements DefenceBehavior{
    /**
     * Method to implement the interface of Defensebehvior.
     * @return a string correspoding to chasing the puck.
     */
    public String play() {
        return "chases the puck";
    }
}
