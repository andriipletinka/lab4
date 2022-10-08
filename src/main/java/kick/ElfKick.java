package kick;

import lotr.Character;

public class ElfKick implements BasicKick{
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoKick.getPower() > whoIsKicked.getPower()) {
            whoIsKicked.setHp(0);
        }
        else {
            whoIsKicked.setPower(whoIsKicked.getPower()-1);
        }
    }
}
