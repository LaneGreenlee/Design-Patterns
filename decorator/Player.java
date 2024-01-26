package decorator;
import java.util.ArrayList;

public abstract class Player {
    protected String name;
    protected ArrayList<String> lines;

    public Player(ArrayList<String> lines, String name) {
        this.name = name;
        this.lines = lines;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        String visual = "";
        for (String line : lines) {
            visual+= line +"\n";
        }

        return "##### "+name+" #####\n"+visual;
    }
}