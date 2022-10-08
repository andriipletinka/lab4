package lotr;

import java.util.Random;

public class GameManager {
    public void fight(Character c1, Character c2) {
        Random random = new Random();
        int roundCounter = 1;
        System.out.println(c1 + " " + c2);
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("Round " + roundCounter++);
            System.out.println("Flipping a coin to choose who kicks first...");
            int coin = random.nextInt(2);
            if (coin == 0) {
                System.out.println(c1.getClass().getSimpleName() + "kicks first");
                System.out.println(c1.getClass().getSimpleName() + "kicks " + c2.getClass().getSimpleName());
                c1.kick(c2);
                System.out.println(c1 + " " + c2);
                System.out.println(c2.getClass().getSimpleName() + "kicks " + c1.getClass().getSimpleName());
                c2.kick(c1);
                System.out.println(c1 + " " + c2);
            }
            else {
                System.out.println(c2.getClass().getSimpleName() + "kicks first");
                System.out.println(c2.getClass().getSimpleName() + "kicks " + c1.getClass().getSimpleName());
                c2.kick(c1);
                System.out.println(c1 + " " + c2);
                System.out.println(c1.getClass().getSimpleName() + "kicks " + c2.getClass().getSimpleName());
                c1.kick(c2);
                System.out.println(c1 + " " + c2);
            }
        }
        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + "wins");
        }
        else {
            System.out.println(c2.getClass().getSimpleName() + "wins");
        }
    }
}