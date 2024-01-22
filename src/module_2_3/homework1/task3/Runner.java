package module_2_3.homework1.task3;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Item item1 = new Item("Вещь1");
        Item item2 = new Item("Вещь2");
        Item item3 = new Item("Вещь3");
        Item item4 = new Item("Вещь4");
        Item item5 = new Item("Вещь5");
        Item item6 = new Item("Вещь6");
        Item item7 = new Item("Вещь7");

        ArrayList<Item> itemsList = new ArrayList<>(List.of(item2, item3, item4, item5, item6,
                item7));

        Stock stock = new Stock();
        stock.addItem(item1);
        stock.addListOfItems(itemsList);
        System.out.println("список всех вещей на складе");
        stock.printList();
        System.out.println("\nсписок четных вещей на складе");
        try {
            stock.printGetAllItems();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        try {
            stock.getItemOverIndex(4);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        stock.printList();
        System.out.println("\nудаление всех вещей на складе кроме последней");
        try {
            stock.removeAllItems();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        stock.printList();
    }
}
