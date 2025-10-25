import java.util.ArrayList;
import java.util.List;

public class Warrior implements Character {

    private String name;

    public Warrior(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

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
        List<String> intro = List.of(
                "Apenas preciso pagar uma velha dívida.",
                "Quero saciar a sede da minha arma e me vangloriar sobre os corpos de monstros!",
                "Meu objetivo e atingir o nível máximo de combate!"
        );
        int sortIntro = (int)(Math.random() * intro.size());

        System.out.println(intro.get(sortIntro));
    }

    @Override
    public void cost() {
        int cost = 10 * (int)(Math.random()*6+1);
        //String name = this.name;
        System.out.println(name + ": os custos para os meus serviços são " + cost + " moedas.");
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
