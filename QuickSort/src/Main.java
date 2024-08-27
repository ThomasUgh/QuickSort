public class Main {
    public static void main(String[] args) {
        var input = "aZuzn13B2c4v3A4D5e6F73fcb#äüö3v42cag8H9ÄP3i0J!@#";

        QuickSorter sorter = new QuickSorter();
        var sortedOutput = sorter.sort(input);

        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sortedOutput);
    }
}
