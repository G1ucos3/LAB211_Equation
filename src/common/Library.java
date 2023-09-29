package common;

import java.util.List;
import repository.EquationRepository;

/**
 *
 * @author ASUS
 */
public class Library {

    Check check = new Check();
    EquationRepository er = new EquationRepository();
    List<Float> list;

    public void superlativeEquation() {
        float a = check.checkInt("A");
        float b = check.checkInt("B");
        list = er.calculateEquation(a, b);
        StringBuilder odd = new StringBuilder().append("Number is Odd:");
        StringBuilder even = new StringBuilder().append("Number is Even:");
        StringBuilder perfect = new StringBuilder().append("Number is Perfect Square:");
        if (list.isEmpty()) {
            System.out.println("Infinitely many solutions.");
            return;
        }
        if (list.get(0) == null) {
            System.out.println("No solution.");
            return;
        }
        System.out.println("Solution: x = " + ((-b) / a));
        for (float num : list) {
            if (check.isOdd(num)) {
                odd.append(num).append(", ");
            }
            if (!check.isOdd(num)) {
                even.append(num).append(", ");
            }
            if (check.isPerfectSquare(num)) {
                perfect.append(num).append(", ");
            }
        }
        System.out.println(odd);
        System.out.println(even);
        System.out.println(perfect);
    }

    public void quadraticEquation() {
        float a = check.checkInt("A");
        float b = check.checkInt("B");
        float c = check.checkInt("C");
        list = er.calculateQuadraticEquation(a, b, c);
        StringBuilder odd = new StringBuilder().append("Number is Odd:");
        StringBuilder even = new StringBuilder().append("Number is Even:");
        StringBuilder perfect = new StringBuilder().append("Number is Perfect Square:");
        if (list.isEmpty()) {
            System.out.println("Infinitely many solutions.");
            return;
        }
        if (list.get(0) == null) {
            System.out.println("No solution.");
            return;
        }
        if (list.size() == 4) {
            System.out.println("Solution: x1 = " + list.get(3) + " and x2 = " +list.get(3));
        } else {
            System.out.println("Solution: x1 = " + list.get(3) + " x2 = " + list.get(4));
        }
        for (Float num : list) {
            if (check.isOdd(num)) {
                odd.append(num).append(", ");
            }
            if (!check.isOdd(num)) {
                even.append(num).append(", ");
            }
            if (check.isPerfectSquare(num)) {
                perfect.append(num).append(", ");
            }
        }
        System.out.println(odd);
        System.out.println(even);
        System.out.println(perfect);
    }
}

