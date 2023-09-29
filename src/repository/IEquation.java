package repository;

import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IEquation {

    public List<Float> calculateEquation(float a, float b);

    public List<Float> calculateQuadraticEquation(float a, float b, float c);
}
