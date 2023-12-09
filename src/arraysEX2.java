import java.util.Arrays;

public class arraysEX2 {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Jen";
        names[3] = "Roman";
        System.out.println("Element 1: " + names[0]);
        System.out.println("Element 2: " + names[1]);
        System.out.println("Element 3: " + names[2]);
        System.out.println("Element 4: " + names[3]);

        //metode tj per ti thirrur ne nje rresht
        int[] numbers = new int[]{3 , 8 , 20 ,6};
        for (int i = 0; i <= numbers.length - 1; i++){
        System.out.println(numbers[i]);
        }

        float[] floats = new float[]{3.6f, 7.45f, 8.02f};
        System.out.println(Arrays.toString(floats));


    }
}
