import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        products.add("Колесо");
        products.add("Двигатель");
        products.add("Колесо");
        products.add("Радиатор");
        products.add("Колесо");
        System.out.println("Исходный список: " + products);

        String firstProduct = products.get(0);
        boolean isDuplicate = false;

        for (String product : products) {
            if (product.equals(firstProduct)) {
                isDuplicate = true;
                break;
            }
        }

        if (isDuplicate) {
            products.removeIf(product -> product.equals(firstProduct));
            System.out.println("Список после удаления повторяющихся названий: " + products);
        } else {
            System.out.println("Повторяющиеся названия не найдены.");
        }
    }
}
