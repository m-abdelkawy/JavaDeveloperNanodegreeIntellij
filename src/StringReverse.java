public class StringReverse {
    public static String stringReverse(String str){
        StringBuilder res = new StringBuilder();

        int strLength = str.length();

        for (int i = 0; i < strLength; i++) {
            res.append(str.charAt(strLength - i - 1));
        }

        return res.toString();
    }

    public static void displayString(String input){
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }
}
