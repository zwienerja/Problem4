public class Problem4 {

    public static void main(String[] args) {
        int largestPalindrome = 0, result;
        int number1 = 0, number2 = 0;


        for (int x = 100; x < 1000; x++) {
            for (int y = 100; y < 1000; y++) {
                result = x * y;
                boolean palindrome = true;
                String resultString = String.valueOf(result);
                int length = resultString.length();
                for (int frontLength = 0; frontLength < length; frontLength++){
                    if (resultString.charAt(frontLength) != resultString.charAt((length-1)-frontLength)) {
                        palindrome = false;
                    }
                }
                if (palindrome){
                    if (result > largestPalindrome){
                        largestPalindrome = result;
                        number1 = x;
                        number2 = y;
                        System.out.println(largestPalindrome);
                    }
                }
            }
        }
        System.out.println(number1 + " and " + number2 + ".  Furthermore, " + number1 + " * " + number2 + " = " + largestPalindrome);
    }
}
