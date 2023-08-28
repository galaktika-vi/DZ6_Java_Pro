import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListInputAndAverageDialog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите целое число " + i + ": ");
            int number = scanner.nextInt();
            numbers.add(number);
        }

        System.out.print("Введенные числа: ");
        for (int number : numbers) {
            System.out.print(number + ", ");
        }

        double average = calculateAverage(numbers);
        System.out.println("\nСреднее арифметическое: " + average);

        scanner.close();
    }

    public static double calculateAverage(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}
