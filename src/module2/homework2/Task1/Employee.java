package module2.homework2.Task1;

import java.util.Queue;

public class Employee {

    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public void throwSuitcase(Queue<Suitcase> suitcasesList) {
        Suitcase suitcase = suitcasesList.poll();
        System.out.printf("%s: Мужики, кидаю чемодан %s\n", this.name, suitcase.getFlightNumber());
    }
}