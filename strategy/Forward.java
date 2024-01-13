package strategy;
import java.util.Random;

/**
 * Class to define the Forward type of Player.
 * @author Laneag
 */
public class Forward extends Player {
    
    /**
     * Method called when a new forward is instantantiated.
     * Defiens all of the data members and behaviors.
     * @param fistName First name of forward
     * @param lastName Last Name of forward
     */
    public Forward(String fistName, String lastName) {
        super(fistName, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
    }

    /**
     * Sets the offense behavior of Forwards.
     * half the time its a pass, the other
     * half its a shot.
     */
    public void setOffenceBehavior() {
        Random random = new Random();
        int halfNumber = random.nextInt(2)+1;

        if (halfNumber==1)
            offenceBehvavior = new PassBehavior();
        else
            offenceBehvavior = new ShootBehavior();

    }

    /**
     * Method that sets the defense behavior for the Forward class.
     * half the time it's chasing the puck, the other
     * half it's blocking behavior.
     */
    public void setDefenceBehavior() {
        Random random = new Random();
        int defNumber = random.nextInt(2)+1;

        
         if (defNumber == 1)
            defenceBehavior = new ChasePuckBehavior();
         else
            defenceBehavior = new BlockBehavior();
    }

    /**
     * Method to create a string representation of the forward.
     * @returns A string representation of the Forward.
     */
    public String toString() {
        return super.toString()+"plays the position: Forward";
    }

}
