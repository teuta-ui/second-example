import java.util.Scanner;
// Implement the program, where you have to read 6 integers (using Scanner class) and
//save them in the previously declared 6-element table. Then compute an arithmetic
//average for all table values and display the result on the standard output.
public class arraysEx5 {
    public static void main(String[] args) {
        int [] numbers = new int[6];
        System.out.println("Enter some numbers:");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];

        }
        System.out.print("Avarage is: " + (sum / numbers.length));

    }
}
