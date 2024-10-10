import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        // Step 1: Create a list of lowercase alphabet characters
        List<Character> alphabet = Arrays.asList(
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        );

        // Step 2-3: Filter vowels and print them
        List<Character> vowels = alphabet.stream().filter(c -> "aeiou".indexOf(c) != -1).collect(Collectors.toList());
        System.out.println("Vowels: " + vowels);

        // Step 4-5: Convert to uppercase and print the characters
        List<Character> uppercaseAlphabets = alphabet.stream().map(Character::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase alphabets: " + uppercaseAlphabets);

        // Step 6: Create a mixed case string
        String mixedCase = "aBcDeFgHiJkLmNoPqRsTuVwXyZ";

        // Step 7: Filter and print uppercase and lowercase characters separately
        List<Character> uppercaseChars = mixedCase.chars().mapToObj(c -> (char) c).filter(Character::isUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase characters: " + uppercaseChars);

        List<Character> lowercaseChars = mixedCase.chars().mapToObj(c -> (char) c).filter(Character::isLowerCase).collect(Collectors.toList());
        System.out.println("Lowercase characters: " + lowercaseChars);
    }
}
