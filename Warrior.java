import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Warrior implements Character {

    private String name;
    private int level;
    private static final int LEVEL_MAX_INICIAL = 12; //constante global
    private int amout;

    //constructor
    public Warrior(String name) {
        this.name = name;
        this. level = (int)(Math.random() * LEVEL_MAX_INICIAL +1);
        this.amout = (int)(Math.random() * 250 +1);

    }

    public String toString() { return name; }
    public int getLevel() { return level;}

    // Interface
    @Override
    public void introduce() {

        //Para criar saídas estilo println
        List<String> intro = List.of(
                "Saudações, viajante. Espero que traga mais ouro que conversa.",
                "Heh… mais um que precisa de uma espada de verdade?",
                "Fique atrás de mim. E tente não morrer, ok?",
                "Ah… um rosto novo. Espero que saiba o que está fazendo.",
                "Sou " + name + ", forjado em batalhas e pago em sangue.",
                "Se veio buscar glória, chegou tarde. Eu já peguei toda."
        );
        int sortIntro = (int)(Math.random() * intro.size());

        System.out.println(name + ": " + intro.get(sortIntro));

    }

    @Override
    public void levelUp() {
        level++;
        System.out.printf("%n%s subiu para o nível %d!%n",name,level);
    }

    @Override
    public void goal() {
        List<String> goalList = List.of(
                "Apenas preciso pagar uma velha dívida.",
                "Quero saciar a sede da minha arma e me vangloriar sobre os corpos de meus inimigos!",
                "Meu objetivo e atingir o nível máximo de combate!",
                "Busco um inimigo digno… alguém que valha a pena morrer enfrentando.",
                "Cada vitória é mais justiça ao mundo, trazida pela minha lâmina.",
                "Luto não por honra… mas porque é o que faço melhor.",
                "Quero ver o topo do mundo e deixar o eco do meu nome por lá.",
                "Meu único propósito é continuar de pé quando todos caírem."
        );
        int sortGoal = (int)(Math.random() * goalList.size());

        System.out.println(name + ": " + goalList.get(sortGoal));
    }

    @Override
    public void cost() {
        int cost = 10 * (int)(Math.random()*6+1);
        System.out.println(name + ": os custos para os meus serviços são " + cost + " moedas.");
    }

    @Override
    public void atack() {
        int dano = level *(int)(Math.random()*7+1);

        //saídas de ataque
        List<Runnable> ataques = new ArrayList<>();
        ataques.add(() -> System.out.printf("%n%s ataca com destreza e causa %d de dano!",name,dano));
        ataques.add(() -> System.out.printf("%n%s avança sobre o inimigo, causando-lhe %d de dano!",name,dano));
        ataques.add(() -> System.out.printf("%nO inimigo recebeu um dano de %d graças a %s!",dano,name));
        ataques.add(() -> System.out.printf("%n%d! Este é o dano causado por %s",dano, name));

        int sorteioAtaque = (int)(Math.random() * ataques.size());

        ataques.get(sorteioAtaque).run();
    }

    @Override
    public void earnings() {

    }

    @Override
    public void amount() {
        System.out.printf("%n%s possui %d moedas.%n",name,amout);
        System.out.println("${name} possui " + amout + "moedas.");
        System.out.println("=================================");
    }
}
