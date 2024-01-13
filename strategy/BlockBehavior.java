package strategy;
import java.util.Random;

public class BlockBehavior implements DefenceBehavior{
    
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
