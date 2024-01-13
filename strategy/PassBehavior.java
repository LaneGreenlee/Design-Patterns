package strategy;

/**
 * Class that implements OffenceBehavior interface.
 * @author Laneag
 */
public class PassBehavior implements OffenceBehavior {
    /**
     * Method to define pass behavior of Players.
     * @return a string that passes to a forward.
     */
    public String play() {
        return "passes to a forward";
    }
}
