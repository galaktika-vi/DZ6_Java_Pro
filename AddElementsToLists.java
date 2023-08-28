import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddElementsToLists {
    public static void main(String[] args) {
        long startTime, endTime;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        startTime = System.currentTimeMillis();
        addElements(arrayList);
        endTime = System.currentTimeMillis();
        System.out.println("Время добавления в ArrayList: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        addElements(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println("Время добавления в LinkedList: " + (endTime - startTime) + " мс");
    }

    public static void addElements(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }
}
