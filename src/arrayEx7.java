//Using loops and 2-dimensional table storing integers, present structure and data as
//below:
//tab[0,0] = 0; tab[0,1] = 1; tab[0,2] = 2;
//tab[1,0] = 3; tab[1,1] = 4; tab[1,2] = 5;
//Please, use table length property.

public class arrayEx7 {
    public static void main(String[] args) {
        int[][] table = new int[2][3];
        int value = 0;

        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                table [i][j] = value;
                System.out.println("table[" + i + "][" + j + "] = " + value);
                value++;
            }

        }

    }
}
