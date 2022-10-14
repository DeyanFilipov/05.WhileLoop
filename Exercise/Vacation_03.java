package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int days = 0;
        int spending = 0;

        while (ownedMoney < neededMoney && spending < 5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            days++;

            if (command.equals("spend")) {
                ownedMoney -= money;
                spending++;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            } else if (command.equals("save")) {
                ownedMoney += money;
                spending = 0;
            }
        }
        if (ownedMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", days);
        }
        if (spending == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", days);
        }

    }
}