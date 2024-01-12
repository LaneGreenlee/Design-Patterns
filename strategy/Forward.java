package strategy;
public class Forward extends Player {
    
    public Forward(String fistName, String lastName) {
        super(fistName, fistName);

    }

    public void setOffenceBehavior() {


    }

    public void setDefenceBehavior() {


    }

    public String toString() {
        return super.toString()+"plays the position: Forward";
    }

}
