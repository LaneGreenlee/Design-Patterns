package decorator;
import java.util.ArrayList;
/**
 * Parent class for Warrior. Has classes to construct
 * a Warrior and display.
 * @author Laneag 
 */
public abstract class Player {
    protected String name;
    protected ArrayList<String> lines;

    /**
     * Super constructor called when a Warrior is created.
     * @param lines Lines of the warrior.
     * @param name Name of the warrior.
     */
    public Player(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;
    }

    /**
     * String method to get the name of the Warrior
     * @return The name of the warrior.
     */
    public String getName() {
        return name;
    }

    /**
     * Method to build a string of the warrior.
     * @return A string representation of the Warrior.
     */
    public String toString() {
        String visual = "";
        for (String line : lines) {
            visual+= line +"\n";
        }

        return "##### "+name+" #####\n"+visual;
    }
}