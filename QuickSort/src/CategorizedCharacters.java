public class CategorizedCharacters {
    private final char[] lowercase;
    private final char[] uppercase;
    private final char[] digits;
    private final char[] specialCharacters;

    public CategorizedCharacters(char[] lowercase, char[] uppercase, char[] digits, char[] specialCharacters) {
        this.lowercase = lowercase;
        this.uppercase = uppercase;
        this.digits = digits;
        this.specialCharacters = specialCharacters;
    }

    public char[] getLowercase() {
        return lowercase;
    }

    public char[] getUppercase() {
        return uppercase;
    }

    public char[] getDigits() {
        return digits;
    }

    public char[] getSpecialCharacters() {
        return specialCharacters;
    }
}