import java.util.List;

public class Wizard implements Character{

    private String name;

    public Wizard(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }


    @Override
    public void introduce() {
        List<String> intro = List.of(
                "Hey","...","Diga!","Posso lhe ajudar??"
        );
        int sortIntro = (int)(Math.random() * intro.size());

        System.out.println(intro.get(sortIntro));
    }

    @Override
    public void goal() {

    }

    @Override
    public void cost() {

    }

    @Override
    public void atack() {

    }

    @Override
    public void Earnings() {

    }

    @Override
    public void Amount() {

    }
}
