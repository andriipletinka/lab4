package lotr;

import lombok.SneakyThrows;

import java.util.Random;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        Class[] characters = {Hobbit.class, Knight.class, King.class, Elf.class};
        return (Character) characters[new Random().nextInt(characters.length)].getDeclaredConstructor().newInstance();
    }
}
