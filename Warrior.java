import java.util.ArrayList;
import java.util.List;

public class Warrior implements Character {

    @Override
    public void introduce() {
        List<String> intro = List.of(
                "Oi","Olá","Hmm...","Sim?"
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
