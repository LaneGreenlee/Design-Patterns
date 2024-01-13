package strategy;
import java.util.Random;

/**
 * Class to implement the blocking behavior
 * which belongs to the DefensiveBehavior type.
 * @author Laneag
 */
public class BlockBehavior implements DefenceBehavior{
    
    /**
     * Method to randomize between three types of 
     * blocking behaviors.
     * @return a string corresponding to the blocking behavior
     */
    public String play() {
        Random rand = new Random();
        int number = rand.nextInt(3)+1;

        String behavior = "";
        if(number==1)
            behavior = "blocks player from passing";
        else if(number==2)
            behavior = "blocks player from shooting";
        else
            behavior = "checks player with puck";

        return behavior;
    }
}
