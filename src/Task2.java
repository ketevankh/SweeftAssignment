import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int amount = input.nextInt();

        System.out.printf("Minimum number of coins required: %d%n", minSplit(amount));
    }

    public static int minSplit(int amount) {
        int count = 0;
        int[] coins = {50, 20, 10, 5, 1};
        for (int i = 0; i < coins.length; i++) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }
        return count;
    }
}
