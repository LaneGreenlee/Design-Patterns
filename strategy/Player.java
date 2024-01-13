package strategy;
import java.util.Random;

/**
 * Base class that defines the type Player.
 * @author Laneag
 */

public abstract class Player {
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehvavior;
    protected Random rand;

    /**
     * Method to set data members of current player
     * @param firstName First Name of player
     * @param lastName Last name of Player
     */
    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Abstract mathods to be defined in derived
     * classes.
     */
    public abstract void setDefenceBehavior();

    public abstract void setOffenceBehavior();

    /**
     * Play method that functions as the base level of 
     * the plays run in the game.
     * @param possesion Do we have possesion?
     * @return either defence of offence behavior based on possesion.
     */
    public String play(boolean possesion) {
        if(possesion) {
            this.setOffenceBehavior();
            return this.offenceBehvavior.play();
        } else {
            this.setDefenceBehavior();
            return this.defenceBehavior.play();
        }
    }

    /**
     * base bethod of toString class.
     * @return The first and last name of the Player.
     */
    public String toString() {
        return firstName+" "+lastName+" ";
    }
    
}
