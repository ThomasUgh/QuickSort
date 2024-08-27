import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        var input = "aZuzn13B2c4v3A4D5e6F73fcb#äüö3v42cag8H9ÄP3i0J!@#";

        var sorter = new QuickSorter();
        var sortedOutput = sorter.sort(input);

        out.println("Original String: " + input);
        out.println("Sorted String: " + sortedOutput);
    }
}
