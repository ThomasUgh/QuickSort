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

    private void sortCategory(char[] array) {
        if (array.length > 1) {
            quickSort(array, 0, array.length - 1);
        }
    }

    private void quickSort(char[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = Partition.partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private String combineSortedCategories(CategorizedCharacters chars) {
        StringBuilder sortedString = new StringBuilder();
        for (char[] chars1 : Arrays.asList(chars.getLowercase(), chars.getUppercase(), chars.getDigits(), chars.getSpecialCharacters())) {
            sortedString.append(chars1);
        }
        return sortedString.toString();
    }
}
