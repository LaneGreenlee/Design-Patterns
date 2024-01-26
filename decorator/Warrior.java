package decorator;

public class Warrior extends Player {
    
    Warrior(String name) {
        super(FileReader.getLines("decorator/txt/warrior.txt"), name);
    }
}
