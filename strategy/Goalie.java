package strategy;

public class Goalie extends Player {
    
    public Goalie(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setOffenceBehavior() {


    }

    public void setDefenceBehavior() {


    }

    public String toString() {
        return super.toString()+"plays the position: Goalie";
    }
}
