package com.fabioperettig.skeletoncrew.services;

import com.fabioperettig.skeletoncrew.messages.woodTask.WoodMessages;
import com.fabioperettig.skeletoncrew.messages.woodTask.WoodMessagesPTBR;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WorkingClass {

    private final Scanner scannerW;
    private List<String> workList;
    private final Random random = new Random();

    //ctor
    public WorkingClass(Scanner scannerW) {
        this.scannerW = scannerW;
    }

    public void availableWorks(){
        workList = new ArrayList<>();
        workList.add("1– Cortar lenha");
        workList.add("2– Ratos na cozinha");
        workList.add("3– Canecas pela taverna");
        workList.add("4– Telhado com goteiras");
        workList.add("0– Cancelar");
    }

    public List<String> getWorkList() {
        return workList;
    }

    public void choosenWork(){
        System.out.println(workList);
        System.out.println("\nEscolha um dos trabalhos:");
        int playerChoice = scannerW.nextInt();
        scannerW.nextLine();

        switch (playerChoice){
            case 1:woodWork(); break;
            case 2:rato(); break;
            case 3:caneca(); break;
            case 4:telhado(); break;
            case 0:break;
        }
    }


    public void woodWork(){

        int woodAmount = random.nextInt(20)+1;
        int woodPayment = random.nextInt(50)+15;
        int woodCollected = 0;

        WoodMessages messages = new WoodMessagesPTBR();
        List<String> intro = messages.woodTaskIntro(woodAmount);
        List<String> collect = messages.woodCollected();
        List<String> complete = messages.woodTaskDone(woodPayment);

        int sortIntro = random.nextInt() * intro.size();
        System.out.println(intro.get(sortIntro));

        do {

            System.out.println(messages.woodTaskInstructions(woodAmount, woodCollected));
            String playerAct = scannerW.nextLine();

            if (playerAct.equalsIgnoreCase("cortar")){
                int sortSuccess = random.nextInt()*collect.size();
                System.out.println(complete.get(sortSuccess));
                woodCollected ++;
            } else {
                System.out.println(messages.wrongAction());
            }

        } while (woodCollected < woodAmount);

        int sortComplete = random.nextInt()*complete.size();
        System.out.println(complete.get(sortComplete));

    }


    /// futuramente
    public void rato(){
        System.out.println("mate ratos na cozinha");
    }

    public void caneca(){
        System.out.println("Há canecas pelo bar");
    }

    public void telhado(){
        System.out.println("conserte o telhado");
    }


}
