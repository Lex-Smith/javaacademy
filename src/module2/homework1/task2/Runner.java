package module2.homework1.task2;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<>(List.of(5, 2, 4));
        List<Integer> secondList = new ArrayList<>(List.of(7, 10));
        List<Integer> finalList = new ArrayList<>();
        finalList.addAll(firstList);
        finalList.addAll(secondList);
        finalList.remove(2);
        System.out.printf("индекс числа 10 - %d\n", finalList.indexOf(10));
    }
}