import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HiringAdventurer {

    static boolean conversaIniciada;
    static String playerConversa;
    static int playerEscolha;
    static Scanner escolha = new Scanner(System.in);


    public static Character hire (List<Character> available, String escolhido){

        Main playergold = new Main();//pegando variável da Classe Main
        double playerGold = playergold.getPlayerGold();


        for (Character c : available) {
            if (c.getName().equalsIgnoreCase(escolhido)) {

                //System.out.println("Você se aproxima de " + c.getName() + ".");
                System.out.printf("%nVocê se aproxima de %s%n.",c.getName());

                c.introduce();
                int cost = c.getCost();
                conversaIniciada = true;

                while (conversaIniciada){
                    System.out.println("\n----------------------------");
                    System.out.println("Escolha a opção desejada");
                    System.out.println("1 - Qual seu objetivo?");
                    System.out.println("2 - Quero você na minha equipe.");
                    System.out.println("3 - Adeus.");
                    playerEscolha = escolha.nextInt();

                    if (playerEscolha == 1) {
                        c.goal();
                        continue;
                    } else if (playerEscolha == 2) {
                        c.cost();
                        System.out.printf("%nFirmar acordo? Custo: %d | Seu ouro: %d%n",cost,playerGold);
                        System.out.println("1 – Sim | 2 – Não");
                        playerEscolha = escolha.nextInt();
                        
                        if (playerEscolha == 1) {
                            if (playerGold > cost){
                                return c;
                            } else {
                                System.out.println("Você não tem ouro suficiente.");
                                continue;
                            }
                        } else if (playerEscolha == 2) {
                            continue;
                        }

                    } else if (playerEscolha == 3) {
                        System.out.println("Até mais, aventureiro"); //incluir método na interface
                        return null;
                    } else {
                        System.out.println("Comando não diponível.");
                        continue;
                    }

                }

            }
        }


        System.out.println("Nenhum aventureiro com esse nome.");
        return null;
    }

}