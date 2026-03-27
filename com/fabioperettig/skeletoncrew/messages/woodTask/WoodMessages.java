package com.fabioperettig.skeletoncrew.messages.woodTask;

import java.util.List;

public interface WoodMessages {

    List<String> woodTaskIntro(int woodAmount);
    String woodTaskInstructions(int woodAmount,int woodCollected);
    List <String> woodCollected();
    String wrongAction();
    List<String> woodTaskDone(int woodPayment);

}
