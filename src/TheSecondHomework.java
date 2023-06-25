public class TheSecondHomework {
    public static void main(String[] args) {
        int number = 123;
        int digitSum = calculateDigitSum(number);
        System.out.println("The sum of the digits of a number " + number + " equal " + digitSum);

        String word1 = "Hello";
        String word2 = "World";
        int wordLengthSum = calculateDigitSum(word1, word2);
        System.out.println("Sum of word lengths: " + wordLengthSum);

        double userInput = 1.5;
        boolean isPositive = calculateDigitSum(userInput);
        System.out.println("Number is > 0: " + isPositive);
    }

    public static int calculateDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int calculateDigitSum(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        return length1 + length2;
    }

    public static boolean calculateDigitSum(double number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }

}