package module2.homework2.task3;

import java.util.HashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {

        final Detail detail1 = new Detail("Пила");
        final Detail detail2 = new Detail("Молоток");
        final Detail detail3 = new Detail("отвертка");
        Map<Detail, Integer> details = new HashMap<>();
        details.put(detail1, 1);
        details.put(detail2, 2);
        details.put(detail3, 3);

        System.out.println(details);
    }
}