public class testArea {

    public static void main(String[] args) {

        Warrior lione = new Warrior("Lione");
        Warrior fabio = new Warrior("Fabio");
        Wizard aranon = new Wizard("Aranon");

        lione.getLevel();
        fabio.getLevel();
        System.out.println(lione.getLevel());
        System.out.println(fabio.getLevel());

        for (int i = 0; i<10; i++){
            fabio.amount();
            lione.amount();
            System.out.println("---------");
        }

        for (int i=0;i<10;i++){
            System.out.printf("lalalala %s e %s%n",lione,aranon);
        }


    }

}
