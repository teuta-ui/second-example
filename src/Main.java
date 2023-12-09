import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        //Pattern pattern = Pattern.compile("a+bcd");
        //matches eshte nje vlere booleane
        //Matcher matcher= pattern.matcher("aaaaaabcd  aaaabbbccdd");
               // System.out.println(matcher.matches());

        System.out.println(MathUtils.power(3, 2));
        MathUtils mathUtils = new MathUtils();
        System.out.println(mathUtils.factorial(5));
    }
}