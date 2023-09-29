package common;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Check {

    public float checkInt(String s) {
        float num;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter " + s + ": ");
                num = sc.nextFloat();
                break;
            } catch (InputMismatchException E) {
                System.err.println("Please input number!");
            }
        }
        return num;
    }

    public boolean isOdd(float number) {
        if ((int) number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPerfectSquare(float num) {
        if ((int) Math.sqrt(num) * (int) Math.sqrt(num) == num) {
            return true;
        } else {
            return false;
        }
    }

}
