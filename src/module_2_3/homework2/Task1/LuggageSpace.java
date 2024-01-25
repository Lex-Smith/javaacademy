package module_2_3.homework2.Task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LuggageSpace {

    private Queue<Suitcase> suitcasesList = new LinkedList<>();
    private Employee employee1 = new Employee("Иваныч");
    private Employee employee2 = new Employee("Василич");
    private Employee employee3 = new Employee("Петрович");

    public void planeArrival(String flightNumber) {
        for (int i = 0; i < 20; i++) {
            Suitcase suitcase = new Suitcase(flightNumber);
            suitcasesList.add(suitcase);
        }
    }

    public void unloadLuggage() {
        int counter = 0;
        int size = suitcasesList.size();
        ArrayList<Employee> employees = new ArrayList<>(List.of(employee1, employee2, employee3));
        for (int i = 0; i < size; i++) {
            employees.get(counter).throwSuitcase(suitcasesList);
            if (counter == 2) {
                counter = 0;
            } else {
                counter++;
            }
        }
    }
}