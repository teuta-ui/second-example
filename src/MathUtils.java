// Please implement class named MathUtils, which will have two static methods:
//a) Method named power(), which for two integer arguments will return the value of
//the first argument raised to the power of the second argument.
//b) Method named factorial(), which for integer argument will return the factorial
//value for this argument (i.e. n! = 1*2*...*(n-1)*n)
//Please also create a test class named MathUtilsTest with main() test method, where you call
//these static methods with sample argument values.

public class MathUtils {
    //a)
    public static double power(int a, int b){
        return Math.pow(a, b);
    }

    //b)
    public double factorial(int a){
        double product = 1;
        for (int i = 1; i <= a; i++) {
            product *= i;
        }
        return product;
    }
}
