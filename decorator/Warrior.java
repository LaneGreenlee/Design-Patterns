package decorator;
/**
 * Class used to create a new Warrior.
 * @author Laneag
 */
public class Warrior extends Player {
    /**
     * Class called when a base Warrior needs to be made.
     * @param name Name of the Warrior to be created.
     */
    public Warrior(String name) {
        super(FileReader.getLines("decorator/txt/warrior.txt"), name);
    }
}
