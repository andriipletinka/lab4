package kick;

import lotr.Character;

import java.util.Random;

public class NobleKick implements BasicKick{
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        whoIsKicked.setHp(whoIsKicked.getHp() - new Random().nextInt(whoKick.getPower())+1);
    }
}
