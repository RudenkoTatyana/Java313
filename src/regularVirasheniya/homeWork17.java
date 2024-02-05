package regularVirasheniya;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class homeWork17 {
    public static void main(String[] args) {
        String s = "+7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 7 (499) 456-45-78";
        String pattern ="\\w*[+()-]*\\d*\\S+";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()){
            System.out.print(matcher.group() + "\t");
        }
    }
}
