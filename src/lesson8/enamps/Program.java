package lesson8.enamps;
import java.util.regex.Pattern;
public class Program {
    public static void main(String[] args) {
        System.out.println(RegEx.UPPER.test("ABC"));
        System.out.println(RegEx.LOWER.test("abc"));
        System.out.println(RegEx.NUMRERIC.test("+111"));
    }
}
enum RegEx{
    UPPER("[A-Z]+"), LOWER("[a-z]+"),
    NUMRERIC("[+-]?[0-9]+");
    private final Pattern pattern;

    RegEx(final String pattern) {
        this.pattern = Pattern.compile(pattern);
    }


    public boolean test(final String input){
        return this.pattern.matcher(input).matches();
    }
}
