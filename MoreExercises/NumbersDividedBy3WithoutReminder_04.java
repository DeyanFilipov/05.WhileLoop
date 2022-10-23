package WhileLoop.MoreExercises;

import java.util.Scanner;

public class NumbersDividedBy3WithoutReminder_04 {
    public static void main(String[] args) {
      int n = 100;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
            }
        }

        }
}
