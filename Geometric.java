import java.lang.Math;

public class Geometric extends AbstractSeries {

    double term = 0.0;
    int element = 0;
    
    public double next() {
        term = term + 1/Math.pow(2,element);
        element++;
        return term;
    }
}
