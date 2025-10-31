import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Working {

    static Scanner scanner = new Scanner(System.in);
    static int playerChoice;
    private static List<String> workList;

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

    public static void rato(){
        System.out.println("mate ratos na cozinha");
    }
    public static void lenha(){
        System.out.println("Corte lenha");
    }
    public static void caneca(){ System.out.println("Há canecas pelo bar");}
    public static void telhado(){ System.out.println("conserte o telhado");}


}
