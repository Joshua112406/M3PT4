public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        numbers[1] = 25; // Modify the second element (index 1)

        System.out.print("Updated array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
