import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рост в метрах ");
        double height = scanner.nextDouble();
        System.out.println("Введите вес в кг.");
        int weight = scanner.nextInt();
        BmiService service = new BmiService();
        double result = service.calculate(height, weight);
        System.out.println("Индекс массы тела = " + result);
    }
}
