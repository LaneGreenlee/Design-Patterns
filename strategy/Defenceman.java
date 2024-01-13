package strategy;
import java.util.Random;

/**
 * Class to define the Defenseman type of player
 * on the hockey team
 * @author Laneag
 */
public class Defenceman extends Player {
    
    /**
     * Cosntructor that runs when Defenseman is instantantiated
     * sets firstname, lastname and behaviors
     * @param fistName First name of Player
     * @param lastName Last name of Player
     */
    public Defenceman(String fistName, String lastName) {
        super(fistName, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
    }

    /**
     * Method to set the offence behavior of the defenseman
     * 90% of time its Passbehavior, the other 10 its Slapshot.
     */
    public void setOffenceBehavior() {
        rand = new Random();

        int ninetyPercent = rand.nextInt(10)+1;

        if (ninetyPercent > 9)
            offenceBehvavior = new SlapShotBehavior();
        else
            offenceBehvavior = new PassBehavior();

    }

    /**
     * Method to set the defence behvior of the defenseman
     * half the time it's Chasing the puck, the other 
     * half it sblocking behavior.
     */
    public void setDefenceBehavior() {
        rand = new Random();

        int half = rand.nextInt(2)+1;

        if(half==1)
            defenceBehavior = new ChasePuckBehavior();
        else
            defenceBehavior = new BlockBehavior();
    }

    /**
     * Method the create a string representation of the defenseman.
     * calls base class tostring as well.
     * @return a string contanign name and postion of DefenseMan.
     */
    public String toString() {
        return super.toString()+"plays the position: Defenseman";
    }
}
