package decorator;
import java.util.ArrayList;
/**
 * Class used for equipping the player with a shield, sword,
 * and/or armor. 
 * @author Laneag
 */
public abstract class PlayerDecorator extends Player{
    private Player player;

    /**
     * Called when a PlayerDecorator is needed.
     * @param player The player to be decorated.
     */
    public PlayerDecorator(Player player) {
        super(player.lines, player.name);
        this.player = player;
    }

    /**
     * Method used to equip the player with a sword, shield, or armor.
     * Iterates through and replaces lines that those would take up using character
     * arrays.
     * @param decor Pass the utility that you would like to give your Warrior.
     */
    protected void integrateDecor(ArrayList<String> decor) {
        ArrayList<String> newWarrior = new ArrayList<>();
        int i = 0;
        for (String line : lines) {
            line+="             ";
            char[] lineToChar = line.toCharArray();
            for (int j = 0; (j < line.length()) && (j < decor.get(i).length()); j++) {
                if(lineToChar[j]!= decor.get(i).charAt(j) && decor.get(i).charAt(j)!=' ') 
                    lineToChar[j] = decor.get(i).charAt(j);
            }
            newWarrior.add(String.valueOf(lineToChar));
            i++;
        }
        lines = newWarrior;
    }
}