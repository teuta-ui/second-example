import java.util.regex.*;

public class patternEX1 {
    public static void main(String[] args) {
        Pattern  pattern = Pattern.compile("([a-zA-Z0-9]+a{8})");
        Matcher matcher = pattern.matcher("sd5678aaaaaaaa");
        boolean isMatch = matcher.matches();
        System.out.println(isMatch);

    }
}
