import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapBrokerNames {
    public static void main(String[] args) {
        List<String> brokerNames = new ArrayList<>();
        brokerNames.add("Брокер1");
        brokerNames.add("Брокер2");
        brokerNames.add("Брокер3");
        brokerNames.add("Брокер4");
        brokerNames.add("Брокер5");
        brokerNames.add("Брокер6");
        brokerNames.add("Брокер7");
        brokerNames.add("Брокер8");
        brokerNames.add("Брокер9");

        System.out.println("Исходный список фамилий брокеров: " + brokerNames);
        swapNames(brokerNames);
        System.out.println("Список после замены фамилий: " + brokerNames);
    }

    public static void swapNames(List<String> names) {
        int size = names.size();
        for (int i = 0; i < size / 2; i++) {
            Collections.swap(names, i, size - i - 1);
        }
    }
}
