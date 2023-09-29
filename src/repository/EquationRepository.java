package repository;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class EquationRepository implements IEquation {

    @Override
    public List<Float> calculateEquation(float a, float b) {
        List<Float> list = new ArrayList<>();
        if (a == 0) {
            if (b == 0) {
                return list;
            } else {
                list.add(null);
                return list;
            }
        }
        float c = (-b) / a;
        list.add(a);
        list.add(b);
        list.add(c);
        return list;
    }

    @Override
    public List<Float> calculateQuadraticEquation(float a, float b, float c) {
        List<Float> list = new ArrayList<>();
        float delta = (float) (Math.pow(b, 2) - (4 * a * c));
        if (a == 0 && b == 0 && c == 0) {
            return list;
        }

        if (delta < 0 || a == 0 && b == 0 && c != 0) {
            list.add(null);
            return list;
        } else if (delta > 0) {
            float x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
            float x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
            list.add(a);
            list.add(b);
            list.add(c);
            list.add(x1);
            list.add(x2);
            return list;
        } else {
            float x = -b / (2 * a);
            list.add(a);
            list.add(b);
            list.add(c);
            list.add(x);
            return list;
        }
    }
}
