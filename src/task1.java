import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sequence of integers: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }

        System.out.printf("The unique number is: %d%n", singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> numsCountMap = new HashMap<>();
        for (int num : nums)
            if (numsCountMap.containsKey(num)) {
                numsCountMap.put(num, numsCountMap.get(num) + 1);
            } else {
                numsCountMap.put(num, 1);
            }
        for (int num : nums) {
            if (numsCountMap.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
