package decorator;
/**
 * Class to create and equip a sword.
 * @author Laneag
 */
public class Sword extends PlayerDecorator {
     /**
     * Constructor called when a sword needs to be equipped.
     * @param player The player that needs a sword.
     */
    public Sword(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("decorator/txt/sword.txt"));
    }
}
