public class BmiService {

    public double calculate(double height, int weight) {
        int power=2;
        double result = Math.pow(height, power);
        return weight / result;


    }

}
