public class Divider {
    public static void divideArrayElements(int[] array, int divisor) {
        int[] dividedArray = new int[array.length];

        try {
            for (int i = 0; i < array.length; i++) {
                dividedArray[i] = array[i] / divisor;
            }
            System.out.println("Divided array elements:");
            for (int num : dividedArray) {
                System.out.println(num);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 0, 20};
        int divisor = 0;

        divideArrayElements(array, divisor);
    }
}
