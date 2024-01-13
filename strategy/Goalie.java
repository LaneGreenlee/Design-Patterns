package strategy;

/**
 * Class to define the Goalie type of player.
 * @author Laneag
 */
public class Goalie extends Player {
    
    /**
     * Method that creates object of Goalie
     * @param firstName First name of goalie
     * @param lastName Last name of goalie
     */
    public Goalie(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
    }

    /**
     * Method that sets the offence behvaior of the goalie
     * to Blocking the goal.
     */
    public void setOffenceBehavior() {
        offenceBehvavior = new BlockGoalBehavior();
    }

    /**
     * Method that sets the defence behvaior of the goalie
     * to Blocking the goal.
     */
    public void setDefenceBehavior() {
        defenceBehavior = new BlockGoalBehavior();
    }

    /**
     * Tostring method for goalie.
     * @return A string representation of Player type Goalie.
     */
    public String toString() {
        return super.toString()+"plays the position: Goalie";
    }
}
