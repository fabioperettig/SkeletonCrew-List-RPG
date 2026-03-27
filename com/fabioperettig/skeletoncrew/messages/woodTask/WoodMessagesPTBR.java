package com.fabioperettig.skeletoncrew.messages.woodTask;

import java.util.List;

public class WoodMessagesPTBR implements WoodMessages {

    @Override
    public List<String> woodTaskIntro(int woodAmount) {
        return List.of(
                "A taverna precisa de mais lenha, preciso que traga uma leva de %d troncos de lenha da floresta.",
                "Um bom dia para o trabalho e a floresta chama. Me traga %d troncos de lenha",
                "Os fornos da taverna não vão se acender sozinhos. Traga mais %d troncos de lenha.",
                "O cheiro de pinho é melhor que o do ale, mas o pagamento é mais agradável. Me traga %dtroncos de lenha.",
                "Preciso de %d de lenha fresca para aquecer a taverna.".formatted(woodAmount)
        );
    }

    @Override
    public String woodTaskInstructions(int woodAmount, int woodCollected) {
        return ("\nColete lenha digitando 'cortar' até obter %d troncos de lenha." +
                "\nLenha cortada: %d").formatted( woodAmount,woodCollected);
    }

    @Override
    public List <String> woodCollected() {
        return List.of(
                "Um golpe certeiro!","Lenha coletada.","Tomara que sobre alguma árvore.",
                "Um acerto crítico no carvalho!", "Hoje não faltará calor."
        );
    }

    @Override
    public String wrongAction() {
        return "E... você erra, que pena.";
    }

    @Override
    public List<String> woodTaskDone(int woodPayment) {
        return List.of(
                "Isso vai realmente ser útil! Aqui estão %d moedas pelo esforço.",
                "Você foi de grande ajuda! %d moedas como pagamento.",
                "Excelente! Trato é trato, aqui estão %d moedas.".formatted(woodPayment)
        );
    }
}
