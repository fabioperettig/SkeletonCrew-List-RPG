/**
 * Project under development. A simple RPG team hiring and management system.
 *
 * @author Fabio Peretti Guimarães
 * @version alpha
 */
public class Main {

    public static void main(String[] args) {


        Warrior Argalord = new Warrior();
        Wizard Kadaj = new Wizard();


        for (int i = 0; i<10;i++){
            Argalord.introduce();
            Kadaj.introduce();
            System.out.println("------------");
        }

    }

}
