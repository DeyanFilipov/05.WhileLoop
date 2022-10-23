package WhileLoop.MoreExercises;

import java.util.Scanner;

public class AverageNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < num; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;
        }
        double average = sum * 1.0 / num;
        System.out.printf("%.2f%n", average);
    }
}
