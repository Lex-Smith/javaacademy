package module_2_3.homework2.task2;

import java.util.HashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {

        final Item item1 = new Item("Яблоко");
        final Item item2 = new Item("Банан");
        final Item item3 = new Item("Апельсин");
        Map<Item, Integer> items = new HashMap<>();
        items.put(item1, 1);
        items.put(item2, 2);
        items.put(item3, 3);

        System.out.println(items.get(item3));
    }
}