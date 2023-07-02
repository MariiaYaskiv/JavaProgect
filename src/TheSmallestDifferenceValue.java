public class TheSmallestDifferenceValue {
    public static void printMinAbsoluteDifference(int[] array) {

        int minDifference = Math.abs(array[0] - array[1]);

        for (int i = 1; i < array.length - 1; i++) {
            int difference = Math.abs(array[i] - array[i + 1]);
            if (difference < minDifference) {
                minDifference = difference;
            }
        }

        System.out.println("The smallest value of the difference between numbers modulo: " + minDifference);
    }

    public static void main(String[] args) {
        int[] array = {5, 11, 7, 20};
        printMinAbsoluteDifference(array);
    }
}