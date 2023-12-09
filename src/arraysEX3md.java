public class arraysEX3md {
    public static void main(String[] args) {

        String[][] myArray = new String[2][];
        myArray[0] = new String[]{"Alice" , "has" , "the" , "cat"};
        myArray[1] = new String[]{"The" , "cat" , "has" , "Alice"};


        for (int i = 0; i < myArray.length; i++){
            for (int j = 0; j < myArray[i].length; j++){
                System.out.println(myArray[i][j]);
            }
        }


    }
}
