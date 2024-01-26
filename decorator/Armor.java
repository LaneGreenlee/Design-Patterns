package decorator;
/**
 * Class used to add armor to your warrior.
 * @author Laneag
 */
public class Armor extends PlayerDecorator {
     /**
      * Constructor called when the user wants to add armor to their warrior.
      * Makes a call to Filereader to put the armor in an ArrayList and call the
      * decorator to put it on.
      * @param player The player to add armor to.
      */
    public Armor(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("decorator/txt/armor.txt"));
    }
    
}
