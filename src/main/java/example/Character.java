package example;

import java.util.*;

/**
 * Created by shuayang on 16/11/19.
 * Character command line.
 * Put the given character into corresponding collection
 */
public class Character {
    public static void main(String[] args) {
        Set<java.lang.Character> numbers = new HashSet<>();
        Set<java.lang.Character> characters = new HashSet<>();
        Set<java.lang.Character> others = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Please give a character:");
            String str = scanner.nextLine();
            if (str.length() != 1) {
                System.err.printf("Invalid character[%s]\n", str);
            }
            java.lang.Character c = str.charAt(0);

            if (c <= 57 && c >= 48) {
                numbers.add(c);
            } else if (c >= 65 && c <= 122) {
                characters.add(c);
            } else {
                others.add(c);
            }
        }
        System.out.println(numbers);
        System.out.println(characters);
        System.out.println(others);
    }
}
