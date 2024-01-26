package decorator;
/**
 * Class to create and equip a shield.
 * @author Laneag
 */
public class Shield extends PlayerDecorator {
    /**
     * Constructor called when ashield needs to be equipped.
     * @param player The player that needs a shield.
     */
    public Shield(Player player){
        super(player);
        integrateDecor(FileReader.getLines("decorator/txt/shield.txt"));
    }
}
