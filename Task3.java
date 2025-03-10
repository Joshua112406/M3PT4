public class Task3 {
    public static void main(String[] args) {
        int[] values = {3, 7, 2, 9, 5, 12, 8};
        int max = values[0]; // Assume the first number is the biggest

        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        System.out.println("Maximum value in the array: " + max);
    }
}
