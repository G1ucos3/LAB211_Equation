package controller;

import common.Library;
import model.Numbers;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class EquationController extends Menu {

    static String[] mc = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
    Library library;
    Numbers numbers;

    public EquationController() {
        super("Equation Program", mc);
        library = new Library();
        numbers = new Numbers();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                System.out.println("----- Calculate Equation -----");
                library.superlativeEquation();
                break;
            case 2:
                System.out.println("----- Calculate Quadratic Equation -----");
                library.quadraticEquation();
                break;
            case 3:
                System.out.println("Exit!");
                System.exit(0);
        }
    }
}
