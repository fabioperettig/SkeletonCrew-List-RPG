import java.util.List;

public class Wizard implements Character{
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
