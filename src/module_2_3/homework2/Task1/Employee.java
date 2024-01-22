package module_2_3.homework2.Task1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void throwSuitcase(Queue<Suitcase> suitcasesList) {
        Suitcase suitcase = suitcasesList.poll();
        //System.out.printf("%s: Мужики, кидаю чемодан %s\n", this.name, suitcase.getFlightNumber());
        System.out.printf("%s: Мужики, кидаю чемодан № %d, рейс %s\n", this.name, suitcase.getNumber(), suitcase.getFlightNumber());
    }
}
//Создать класс работник. Имеет имя.
//Имеет функцию кинуть багаж с криком. На вход набор чемоданов.
//Работник берет один чемодан из набора чемоданов.
//Печатает на экран: {имя работника}: Мужики, кидаю чемодан {номер рейса чемодана}