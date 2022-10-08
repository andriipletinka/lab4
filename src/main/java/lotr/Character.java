package lotr;

import kick.BasicKick;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public abstract class Character {
    @Getter
    private int hp;
    @Getter @Setter
    private int power;

    private BasicKick kick;

    public Character(int hp, int power, BasicKick kick) {
        this.hp = hp;
        this.power = power;
        this.kick = kick;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public void kick(Character whoIsKicked){
        this.kick.kick(this, whoIsKicked);
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
