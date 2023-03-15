import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        String a = scanner.nextLine();
        System.out.print("Enter second binary number: ");
        String b = scanner.nextLine();

        System.out.printf("Binary sum is: %s%n", binaryAdd(a, b));
    }

    public static String binaryAdd(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int bit1 = i >= 0 ? a.charAt(i) - '0' : 0;
            int bit2 = j >= 0 ? b.charAt(j) - '0' : 0;
            int sum = bit1 + bit2 + carry;
            carry = sum / 2;
            int bit = sum % 2;
            sb.insert(0, bit);
            i--;
            j--;
        }
        return sb.toString();
    }
}
