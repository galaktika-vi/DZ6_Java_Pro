import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите целое число " + i + ": ");
            int number = scanner.nextInt();
            numbers.add(number);
        }

        sort(numbers);

        System.out.print("Отсортированный список: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }

    public static void sort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > current) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, current);
        }
    }
}
