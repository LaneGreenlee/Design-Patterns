package strategy;
import java.util.Random;

public class BlockGoalBehavior implements OffenceBehavior, DefenceBehavior{
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
