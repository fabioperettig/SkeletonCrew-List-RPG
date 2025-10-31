import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class WorkingClass {

    static Scanner scanner = new Scanner(System.in);
    static int playerChoice;
    static String playerAct;
    private static List<String> workList;
    static Random rnd = new Random();

    public static void availableWorks(){
        workList = new ArrayList<>();
        workList.add("1– Cortar lenha");
        workList.add("2– Ratos na cozinha");
        workList.add("3– Canecas pela taverna");
        workList.add("4– Telhado com goteiras");
        workList.add("0– Cancelar");
    }

    public static List<String> getWorkList() {
        return workList;
    }

    public static void choosenWork(){
        System.out.println(workList);
        System.out.println("\nEscolha um dos trabalhos:");
        playerChoice = scanner.nextInt();
        scanner.nextLine();

        switch (playerChoice){
            case 1:lenha(); break;
            case 2:rato(); break;
            case 3:caneca(); break;
            case 4:telhado(); break;
            case 0:break;
        }
    }


    //Métodos
    public static void lenha(){
        int lenhaQtd = (int)(Math.random()*20+1);
        int lenhaCortada = 0;

        List<String> introLenha = List.of(
                "A taverna precisa de mais lenha, preciso que traga uma leva de " + lenhaQtd + " troncos de lenha da floresta.",
                "Um bom dia para o trabalho e a floresta chama. Me traga " + lenhaQtd + " troncos de lenha",
                "Os fornos da taverna não vão se acender sozinhos. Traga mais " + lenhaQtd + " troncos de lenha.",
                "O cheiro de pinho é melhor que o do ale, mas o pagamento é mais agradável. Me traga " + lenhaQtd + "troncos de lenha.",
                "Preciso de " + lenhaQtd + " de lenha fresca para aquecer a taverna."
        );

        int sortIntro = (int)(Math.random() * introLenha.size());
        System.out.println("\n"+introLenha.get(sortIntro));

        do {

            System.out.printf("%nColete lenha digitando 'cortar' até obter %d troncos de lenha.%n",lenhaQtd);
            System.out.println("Lenha cortada: " + lenhaCortada);
            playerAct = scanner.nextLine();

            if (playerAct.equalsIgnoreCase("cortar")){
                System.out.println("Lenha coletada!");
                lenhaCortada ++;
            } else {
                System.out.println("Você errou.");
            }

        } while (lenhaCortada !=lenhaQtd);

    }

    public static void rato(){
        System.out.println("mate ratos na cozinha");
    }

    public static void caneca(){
        System.out.println("Há canecas pelo bar");
    }

    public static void telhado(){
        System.out.println("conserte o telhado");
    }


}
