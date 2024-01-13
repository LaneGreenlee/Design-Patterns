package strategy;
import java.util.Random;
public class Forward extends Player {
    
    public Forward(String fistName, String lastName) {
        super(fistName, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
    }

    public void setOffenceBehavior() {
        Random random = new Random();
        int halfNumber = random.nextInt(2)+1;

        if (halfNumber==1)
            offenceBehvavior = new PassBehavior();
        else
            offenceBehvavior = new ShootBehavior();

    }

    public void setDefenceBehavior() {
        Random random = new Random();
        int defNumber = random.nextInt(2)+1;

        
         if (defNumber == 1)
            defenceBehavior = new ChasePuckBehavior();
         else
            defenceBehavior = new BlockBehavior();
    }

    public String toString() {
        return super.toString()+"plays the position: Forward";
    }

}
