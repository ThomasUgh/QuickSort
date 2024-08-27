import java.util.ArrayList;
import java.util.List;

public class StringCategorizer {

    public CategorizedCharacters categorize(String input) {
        List<Character> lowercase = new ArrayList<>();
        List<Character> uppercase = new ArrayList<>();
        List<Character> digits = new ArrayList<>();
        List<Character> specialCharacters = new ArrayList<>();

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercase.add(c);
            } else if (Character.isUpperCase(c)) {
                uppercase.add(c);
            } else if (Character.isDigit(c)) {
                digits.add(c);
            } else {
                specialCharacters.add(c);
            }
        }
    }
    }
}
