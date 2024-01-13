package strategy;

/**
 * Class to implement Offence Behavior interface for
 * The shooting behvaior.
 * @author Laneag
 */
public class ShootBehavior implements OffenceBehavior {
    /**
     * Method to define the shooting behavior
     * @return a string representation of shooting behavior.
     */
    public String play() {
        return "shoots at goal";
    }
}
