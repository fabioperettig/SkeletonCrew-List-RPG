import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Project under development. A simple RPG team hiring and management system.
 *
 * @author Fabio Peretti Guimarães
 * @version alpha
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static boolean gameON;
    static String playerEscolha;
    static int playerGold = 500;
    static int day = 1;
    static int escolha;

    public static void main(String[] args) {

        Warrior algalord = new Warrior("Algalord");
        Warrior baldrik = new Warrior("Baldrik");
        Warrior serion = new Warrior("Serion");

        Wizard kadaj = new Wizard("Kadaj");
        Wizard eloria = new Wizard("Eloria");
        Wizard morthen = new Wizard("Morthen");
        Wizard velira = new Wizard("Velira");

        List<Object> available = new ArrayList<>();
        available.add(algalord);
        available.add(baldrik);
        available.add(serion);
        available.add(kadaj);
        available.add(eloria);
        available.add(morthen);
        available.add(velira);

        List<Object> hired = new ArrayList<>();

        System.out.println("\nIniciar game? Sim | Não");
        playerEscolha = scanner.nextLine();

        if (playerEscolha.equalsIgnoreCase("sim")){
            gameON = true;

            do {
                status();
                System.out.println("contratar?");
                playerEscolha = scanner.nextLine();
                if (playerEscolha.equalsIgnoreCase("s")){
                    algalord.introduce();
                    algalord.cost();
                    System.out.println("pagar?");
                    playerEscolha=scanner.nextLine();
                    if (playerEscolha.equalsIgnoreCase("s")){
                        available.remove(algalord);
                        hired.add(algalord);
                    }

                    System.out.println("Tribulação disponível: "+available);
                    System.out.println("Sua equipe: "+hired);
                }

                gameON=false;


            }while (gameON);

        }

    }


    public static void status(){
        System.out.printf("-- Dia: %d ----- Ouro: %d -----%n",day,playerGold);
        System.out.println("-------------------------------");
    }

}
