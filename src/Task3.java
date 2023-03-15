import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sequence of integers: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }

        System.out.printf("Minimum missing positive number: %d%n", notContains(nums));
    }

    public static int notContains(int[] array) {
        Arrays.sort(array);
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == result) {
                result++;
            } else if (array[i] < result) {

            } else {
                return result;
            }
        }
        return result;
    }
}
