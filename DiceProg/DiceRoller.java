import java.util.Random;
public class DiceRoller {                                           //this file is used by DiceMain.java😬🥴

    Random random;                                                  // Global var
    int num;                                                        // Global var
    DiceRoller(){
        random = new Random();
        roll();
    }

    void roll(){
        num = random.nextInt(6)+1;
        System.out.println(num);
    }
}
