import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рост в метрах ");
        double height = scanner.nextDouble();
        System.out.println("Введите вес в кг.");
        int weight = scanner.nextInt();
        int power = 2;
        BmiService service = new BmiService();
        double result = service.calculate(weight, height, power);
        System.out.println("Индекс массы тела = " + result);
    }
}
