public class TranslateNumberToWord {
    private static final String[] LESS_THAN_20 =
            {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                    "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                    "seventeen", "eighteen", "nineteen"};
    private static final String[] TENS = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String[] THOUSANDS = {"", "thousand", "million", "billion"};

    public static String translateNumberToWord(int num) {
        String res = "";
        if (num == 0) return "zero";

        int i = 0;
        while (num > 0){
            if(num%1000 != 0){
                res = helper(num%1000) + " " + THOUSANDS[i] + " " + res;
            }
            num /= 1000;
            i++;
        }
        return res;
    }

    private static String helper(int num) {
        if (num == 0) return "";
        else if (num < 20) return LESS_THAN_20[num];
        else if (num < 100) {//52
            return TENS[num / 10] + " " + helper(num % 10);
        }
        else {
            return LESS_THAN_20[num/100] + " " + "hundred" + " " + helper(num % 100);
        }
    }
}
