package decorator;
import java.util.ArrayList;

public abstract class PlayerDecorator extends Player{
    private Player player;

    public PlayerDecorator(Player player) {
        super(player.lines, player.name);
        this.player = player;
    }

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