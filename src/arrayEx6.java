// Please, implement the program, which will be displaying 2-dimensional table like this
//below:
//0 0 0 0 0
//0 1 0 0 0
//0 0 2 0 0
//0 0 0 3 0
//0 0 0 0 4
//Notice: Use a 2-dimensional table as a structure. Do not initialize the table in the static way -
//please, fill the table values using ‘for’ loops.
public class arrayEx6 {
    public static void main(String[] args) {
        int[][] table = new int[5][5];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = 0;
                if (i == j) {
                    table[i][j] = i;
                }
                else {
                    table[i][j] = 0;
                }
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }
}
