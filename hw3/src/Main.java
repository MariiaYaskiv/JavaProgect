
public class Main {
    public static void main(String[] args) {
        String word1 = "apple";
        String word2 = "banana";
        String word3 = "orange";
        String longestWord = findLongestWord(word1, word2, word3);
        System.out.println("The longest word is: " + longestWord);
        printFirstChristmasTree();
        printSecondChristmasTree();
        printThirdChristmasTree();
        int monthNumber = 6;
        printNumberOfDaysInMonth(monthNumber);
    }

    public static String findLongestWord(String word1, String word2, String word3) {
        if (word1.length() >= word2.length() && word1.length() >= word3.length()) {
            return word1;
        } else {
            return word2.length() >= word1.length() && word2.length() >= word3.length() ? word2 : word3;
        }
    }

    public static void printFirstChristmasTree() {
        int i;
        int j;
        for(i = 1; i <= 5; ++i) {
            for(j = 1; j <= i; ++j) {
                System.out.print("x");
            }

            System.out.println();
        }

        for(i = 4; i >= 1; --i) {
            for(j = 1; j <= i; ++j) {
                System.out.print("x");
            }

            System.out.println();
        }

    }

    public static void printSecondChristmasTree() {
        for(int i = 4; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("x");
            }

            System.out.println();
        }

    }

    public static void printThirdChristmasTree() {
        for(int i = 1; i <= 5; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("x");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void printNumberOfDaysInMonth(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("January - 31 day");
                break;
            case 2:
                System.out.println("February - 28 days");
                break;
            case 3:
                System.out.println("March - 31 day");
                break;
            case 4:
                System.out.println("April - 30 days");
                break;
            case 5:
                System.out.println("May - 31 day");
                break;
            case 6:
                System.out.println("June - 30 days");
                break;
            case 7:
                System.out.println("July - 31 day");
                break;
            case 8:
                System.out.println("August - 31 day");
                break;
            case 9:
                System.out.println("September - 30 days");
                break;
            case 10:
                System.out.println("October - 31 day");
                break;
            case 11:
                System.out.println("November - 30 days");
                break;
            case 12:
                System.out.println("December - 31 day");
                break;
            default:
                System.out.println("Wrong number of the month");
        }

    }
}

