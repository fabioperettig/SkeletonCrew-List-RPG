import java.util.ArrayList;
import java.util.List;
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
    static int playerEscolhaInt;
    private static String playerNome;
    private static int playerGold = 5000;
    private static int valorObjetivo = 145000;
    static int day = 1;
    static int escolha;

    public static void main(String[] args) throws InterruptedException {

        Working.availableWorks();

        Warrior algalord = new Warrior("Algalord");
        Warrior baldrik = new Warrior("Baldrik");
        Warrior serion = new Warrior("Serion");

        Wizard kadaj = new Wizard("Kadaj");
        Wizard eloria = new Wizard("Eloria");
        Wizard morthen = new Wizard("Morthen");
        Wizard velira = new Wizard("Velira");

        List<Character> available = new ArrayList<>(List.of(
                algalord, baldrik, serion, kadaj, eloria, morthen, velira
        ));


        List<Character> hired = new ArrayList<>();

        System.out.println("\nIniciar game? Sim | Não");
        playerEscolha = scanner.nextLine();

        if (playerEscolha.equalsIgnoreCase("sim")){
            System.out.println("\nInsira seu nome: ");
            playerNome = scanner.nextLine();

            if (day == 1){
                System.out.printf("%nOlá %s, seu objetivo é juntar %d moedas de ouro para comprar seu navio e sair explorando o mundo.%n",playerNome,valorObjetivo);
                Thread.sleep(5000);
            }

            gameON = true;

            do {
                status();
                System.out.println("Escolha uma opção:\n");
                System.out.println("1– Trabalhar | 2- Contratar membro | 3- Partir em expedição");
                playerEscolhaInt = scanner.nextInt();
                scanner.nextLine();

                switch (playerEscolhaInt) {
                    case 1:
                        System.out.println(Working.getWorkList());
                        Working.choosenWork();
                }

                if (playerEscolha.equalsIgnoreCase("s")){
                    System.out.println("Escolha um dos aventureiros disponíveis: ");

                    //imprime herois
                    for (Character c : available) {

                        System.out.println("– " + c.getName() +
                                " | Classe: " + c.getClass().getName() +
                                " | Level: " + c.getLevel());
                    }

                    playerEscolha = scanner.nextLine();
                    Character contratado = HiringAdventurer.hire(available, playerEscolha);

                    if (contratado != null){
                        hired.add(contratado);
                        available.remove(contratado);
                        playerGold -= contratado.getCost();
                    }

                    System.out.println("Tribulação disponível: "+available);
                    System.out.println("Sua equipe: "+hired);
                    System.out.println(playerGold);
                }

                gameON=false;


            }while (gameON);

        }

    }


    public static void status(){
        System.out.printf("-- Dia: %d ----- Ouro: %d -----%n",day,playerGold);
        System.out.println("-------------------------------\n");
    }

    public int getPlayerGold(){
        return playerGold;
    }

}
