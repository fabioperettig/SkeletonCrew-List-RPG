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
    private static int playerGold = 600;
    private static int valorObjetivo = 145000;
    static int day = 1;
    static int escolha;

    public static void main(String[] args) throws InterruptedException {
        

        List<Character> available = new ArrayList<>(List.of(
                HeroesCentral.getAlgalord(), HeroesCentral.getBaldrik(), HeroesCentral.getSerion(),
                HeroesCentral.getFjord(), HeroesCentral.getKadaj(), HeroesCentral.getEloria(),
                HeroesCentral.getMorthen(), HeroesCentral.getVelira()
        ));


        List<Character> hired = new ArrayList<>();

        System.out.println("\nIniciar game? Sim | Não");
        playerEscolha = scanner.nextLine();

        if (playerEscolha.equalsIgnoreCase("sim")){
            System.out.println("\nInsira seu nome: ");
            playerNome = scanner.nextLine();

            if (day == 1){
                System.out.printf("%nOlá %s, seu objetivo é juntar %d moedas de ouro" +
                        "para comprar seu navio e sair explorando o mundo.%n",playerNome,valorObjetivo);
                Thread.sleep(3000);
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
                        WorkingClass.availableWorks();
                        WorkingClass.choosenWork();
                        System.out.println("Voce ganha 100");
                        playerGold = playerGold + 100;
                        status();

                    case 2:
                        System.out.println("Temos alguns aventureiros disponíveis hoje ");
                }

                if (playerEscolha.equalsIgnoreCase("s")){

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
