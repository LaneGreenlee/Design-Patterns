package strategy;

/**
 * Class to implement the OffenceBehavior interface
 * for type of play Slap shot.
 * @author Laneag
 */
public class SlapShotBehavior implements OffenceBehavior{
    /**
     * Class to define the Slap shot behavior.
     * @return A string representation of Slap shot behavior.
     */
    public String play() {
        return "shoots puck from the blue line";
    }    
}
