package mate.academy.lesson12;

import java.util.TreeSet;

public class SetIterator {
    public static void main(String[] args) {
        TreeSet<Character> characters = new TreeSet<>();
        characters.add('a');
        characters.add('d');
        characters.add('b');
        characters.add('g');
        characters.add('z');
        characters.add('f');

        StringBuilder result = new StringBuilder("");
        for (Character c: characters) {
            result.append(c);
        }

        for (String s: args) {
            System.out.println(s);
        }
    }
}
