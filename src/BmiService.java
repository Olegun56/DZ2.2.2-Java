public class BmiService {
    public double calculate(int weight, double height, int power) {
        double result = Math.pow(height, power);
        return weight / result;

    }

}
