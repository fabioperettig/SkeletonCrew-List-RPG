public class testArea {

    public static void main(String[] args) {

        Warrior lione = new Warrior("Lione");
        Wizard aranon = new Wizard("Aranon");

        lione.getLevel();
        System.out.println(lione.getLevel());

        for (int i = 0; i<10; i++){
            lione.introduce();
            aranon.introduce();
            System.out.println("---------");
        }

    }

}
