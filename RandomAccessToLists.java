import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomAccessToLists {
    public static void main(String[] args) {
        long startTime, endTime;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        addElements(arrayList);
        addElements(linkedList);

        // Выбор элементов наугад 100000 раз из ArrayList
        startTime = System.currentTimeMillis();
        System.out.println("Выбранные элементы из ArrayList:");
        for (int i = 0; i < 100000; i++) {
            int index = random.nextInt(arrayList.size());
            int element = arrayList.get(index);
            System.out.print(element + " ");
        }
        System.out.println();
        endTime = System.currentTimeMillis();
        System.out.println("Время выбора элементов из ArrayList: " + (endTime - startTime) + " мс");

        // Выбор элементов наугад 100000 раз из LinkedList
        startTime = System.currentTimeMillis();
        System.out.println("Выбранные элементы из LinkedList:");
        for (int i = 0; i < 100000; i++) {
            int index = random.nextInt(linkedList.size());
            int element = linkedList.get(index);
            System.out.print(element + " ");
        }
        System.out.println();
        endTime = System.currentTimeMillis();
        System.out.println("Время выбора элементов из LinkedList: " + (endTime - startTime) + " мс");
    }

    public static void addElements(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }
}
