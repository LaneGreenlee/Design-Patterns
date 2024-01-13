package strategy;
import java.util.Random;

public class Defenceman extends Player {
    
    public Defenceman(String fistName, String lastName) {
        super(fistName, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
    }

    public void setOffenceBehavior() {
        rand = new Random();

        int ninetyPercent = rand.nextInt(10)+1;

        if (ninetyPercent > 9)
            offenceBehvavior = new SlapShotBehavior();
        else
            offenceBehvavior = new PassBehavior();

    }

    public void setDefenceBehavior() {
        rand = new Random();

        int half = rand.nextInt(2)+1;

        if(half==1)
            defenceBehavior = new ChasePuckBehavior();
        else
            defenceBehavior = new BlockBehavior();
    }

    public String toString() {
        return super.toString()+"plays the position: Defenseman";
    }
}
