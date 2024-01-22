package module_2_3.homework1.task3;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void addListOfItems(ArrayList<Item> list) {
        items.addAll(list);
    }

    /**
     * Метод возвращает список каждой четной вещи на складе
     */
    public ArrayList getAllItems() throws Exception {
        if (items.size() < 2) {
            throw new Exception("на складе меньше 2 предметов");
        }
        ArrayList<Item> evenItemList = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (i % 2 != 0) {
                evenItemList.add(items.get(i));
            }
        }
        return evenItemList;
    }

    /**
     * Метод печатает список каждой четной вещи на складе
     * Для проверки работы метода getAllItems
     */
    public void printGetAllItems() throws Exception {
        List<Item> tmpList = getAllItems();
        for (Item item : tmpList) {
            System.out.println(item.getItemName());
        }
    }

    public void getItemOverIndex(int index) throws Exception {
        if (items.isEmpty()) {
            throw new Exception("на складе нет вещей");
        }
        items.remove(index);
        System.out.printf("Вещь под индексом: %d взята со склада.\n", index);
    }

    public void removeAllItems() throws Exception {
        if (items.isEmpty()) {
            throw new Exception("на складе нет вещей");
        }
        Item tempItem = items.get(items.size() - 1);
        items.clear();
        items.add(tempItem);
    }

    /**
     * Печатает список вещей находящихся на складе
     * Для проверки работы методов
     */
    public void printList() {
        for (Item item : items) {
            System.out.println(item.getItemName());
        }
    }
}
