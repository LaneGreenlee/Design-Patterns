package strategy;
import java.util.Random;

/**
 * Class to define BlockGoalBehavior which implements Offense and defense 
 * behaviors. Needs to implement two because of Goalie class using block 
 * behavior for both defense and offense.
 * @author Laneag
 */
public class BlockGoalBehavior implements OffenceBehavior, DefenceBehavior{

    /**
     * Method to implement the play interface.
     * Randomizes between 4 different goal blocking behaviors.
     * @return a string of blocking behavior.
     */
    public String play() {
        Random rand = new Random();
        int number = rand.nextInt(4)+1;

        String behavior = "";
        if(number==1)
            behavior = "hand blocks the puck";
        else if(number==2)
            behavior = "catches the puck";
        else if(number==3)
            behavior = "blocks puck with knee pads";
        else
            behavior = "blocks puck with stick";

        return behavior;
    }
}
