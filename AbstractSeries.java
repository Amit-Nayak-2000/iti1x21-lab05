public abstract class AbstractSeries implements Series {

    public double[] take(int k) {
        double[] result = new double[k];

        for(int i = 0; i < k; i++){
            result[i] = this.next();
        }

        return result;
        
    }

}
