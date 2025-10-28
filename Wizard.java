import java.util.List;
import java.util.List;
import java.util.ArrayList;

public class Wizard implements Character{

    private String name;
    private int level;
    private static final int LEVEL_MAX_INICIAL = 12; //constante global
    private int amount = (int)(Math.random() * 250 +1);
    private int cost = 15 * (int)(Math.random()*6+1);

    public Wizard(String name) {
        this.name = name;
        this.level = (int)(Math.random() * LEVEL_MAX_INICIAL +1);
    }

    public String toString() { return name; }
    public int getLevel() { return level; }
    public int getCost() {return cost;}

    @Override
    public String getName() {
        return name;
    }

    // Interface
    @Override
    public void introduce() {

        //Para criar saídas estilo prinf
        List<String> intro = List.of(
                "Saudações. Que o conhecimento seja nossa luz.",
                "Você procura poder... ou conhecimento?",
                "Observe atentamente. Pequenas faíscas precedem incêndios.",
                "Há mais poder entre as páginas de um grimório do que em mil espadas.",
                "Eu vim preparado. O caos nunca adormece.",
                "Saudações viajante, sou %s e será um prazer lhe acompanhar."
        );
        int sortIntro = (int)(Math.random() * intro.size());
        String frase = intro.get(sortIntro);

        //condicional para checar se há marcador de printf
        if (frase.contains("%s")) {
            frase = String.format(frase,name);
        }

        System.out.println(name + ": " + frase);
    }

    @Override
    public void levelUp() {
        level++;
        System.out.printf("%n%s subiu para o nível %d!%n",name,level);
    }

    @Override
    public void goal() {

        List<String> goalList = List.of(
                "Busco compreender o que sequer ousamos nomear.",
                "Cada criatura caída revela mais sobre as engrenagens do universo.",
                "Dominar os elementos não é o fim, é só o começo.",
                "Minha jornada não é por glória, mas por clareza.",
                "Quero ver o que há além do véu que chamam de realidade.",
                "Afinal, que valor tem o poder sem propósito?"
        );

        int sortGoal = (int)(Math.random() * goalList.size());
        System.out.println(name + ": " + goalList.get(sortGoal));
    }

    @Override
    public void cost() {
        System.out.println(name + ": os custos para os meus serviços são " + cost + " moedas.");
    }

    @Override
    public void atack() {

        int dano = level * (int)(Math.random()*7+1);

        List<Runnable> ataques = new ArrayList<>();
        ataques.add(() -> System.out.printf("%n%s ataca com destreza e causa %d de dano!",name,dano));
        ataques.add(() -> System.out.printf("%n%s avança sobre o inimigo, causando-lhe %d de dano!",name,dano));
        ataques.add(() -> System.out.printf("%nO inimigo recebeu um dano de %d graças a %s!",dano,name));
        ataques.add(() -> System.out.printf("%n%d! Este é o dano causado por %s",dano, name));

        int sorteioAtaque = (int)(Math.random()*ataques.size());

        ataques.get(sorteioAtaque).run();

    }

    @Override
    public void earnings() {

    }

    @Override
    public void amount() {
        System.out.printf("%s possui %d moedas.%n",name,amount);
    }


}
