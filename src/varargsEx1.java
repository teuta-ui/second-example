public class varargsEx1 {
    public static void main(String[] args) {
        stringMethod("hello" , "hi" , "hey");
        stringMethod("bye");
        stringMethod("hey" , "bye");

    }

    public static String stringMethod(String... text){
        for (String string: text){
           System.out.println(string);
        }

        return null;
    }
}
