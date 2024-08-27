import java.util.Arrays;

public class QuickSorter {

    public String sort(String input) {
        var categorizer = new StringCategorizer();
        var categorizedChars = categorizer.categorize(input);

        for (char[] chars : Arrays.asList(categorizedChars.getLowercase(), categorizedChars.getUppercase(), categorizedChars.getDigits(), categorizedChars.getSpecialCharacters())) {
            sortCategory(chars);
        }
//        sortCategory(categorizedChars.getLowercase());
//        sortCategory(categorizedChars.getUppercase());
//        sortCategory(categorizedChars.getDigits());
//        sortCategory(categorizedChars.getSpecialCharacters());
        return combineSortedCategories(categorizedChars);
    }
}
