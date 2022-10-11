package WhileLoop.Lab;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int minNum = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input);

            if (currentNum < minNum) {
                minNum = currentNum;
            }
            input = scanner.nextLine();

        }
        System.out.println(minNum);
    }
}
