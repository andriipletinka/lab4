package lotr;

import kick.NobleKick;

import java.util.Random;

public abstract class Noble extends Character {

    private static Random random = new Random();

    public Noble(int minVal, int maxVal) {
        super(random.nextInt(maxVal-minVal+1)+minVal,
                random.nextInt(maxVal-minVal+1)+minVal, new NobleKick());
    }
}
