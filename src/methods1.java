public class methods1 {
    public static void main(String[] args) {
        int firstNumber = diff(8, 2);
        System.out.println(firstNumber);
        System.out.println(diff(5,1));
        System.out.println(diff(6,9));
        someMethod(1,6);

    }
    public static int diff(int args1 , int args2){
       // njera nga metodat return args1 - args2; osee:

        int difference = args1 - args2;
        System.out.println("The number is: ");
        return difference;
    }

    // vetem printon dicka nuk eshte se kthen nje vlere ta caktuar
    public static void someMethod(int arg1 , int arg2){
        if (arg1 < arg2){
            return;
        }

        int diff = arg1 - arg2;
        System.out.println(diff);
    }
}
