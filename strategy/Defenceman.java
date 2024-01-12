package strategy;
public class Defenceman extends Player {
    
    public Defenceman(String fistName, String lastName) {
        super(fistName, lastName);

    }

    public void setOffenceBehavior() {


    }

    public void setDefenceBehavior() {


    }

    public String toString() {
        return super.toString()+"plays the position: Defenseman";
    }
}
