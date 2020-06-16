public class Arithmetic extends AbstractSeries {

    double term = 0.0;
    int element = 1;

    public double next() {
        term = term + element;
        element++;
        return term;
    }
}
