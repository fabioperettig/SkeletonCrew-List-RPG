import java.util.ArrayList;
import java.util.List;

public class Elf implements Character{

    private String name;
    private int level;
    private static final int LEVEL_MAX_INICIAL = 14;
    private int amount = (int)(Math.random()*250+1);
    private int cost = 15 * (int)(Math.random()*9+1);


    public Elf(String name, int level) {
        this.name = name;
        this.level = (int)(Math.random() * LEVEL_MAX_INICIAL + 1);
    }

    public int heroLevel() { return level; }
    public String toString() { return name; }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getCost() {
        return cost;
    }



    @Override
    public void introduce() {

        List<String> intro = List.of(
                "a",
                "b"
        );

        int sortIntro = (int)(Math.random() * intro.size());
        System.out.println(name + ": " + intro.get(sortIntro));

    }

    @Override
    public void goal() {

        List<String> goalList = List.of(
                "a",
                "b"
        );

        int sortGoal = (int)(Math.random() * goalList.size());
        System.out.println(name + ": " + goalList.get(sortGoal));

    }

    @Override
    public void cost() {

    }

    @Override
    public void atack() {

    }

    @Override
    public void earnings() {

    }

    @Override
    public void amount() {

    }

    @Override
    public void levelUp() {

    }


}