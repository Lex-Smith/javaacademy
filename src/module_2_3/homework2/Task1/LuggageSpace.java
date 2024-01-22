package module_2_3.homework2.Task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LuggageSpace {

    private static Queue<Suitcase> suitcasesList = new LinkedList<>();
    private static Employee employee1 = new Employee("Иваныч");
    private static Employee employee2 = new Employee("Василич");
    private static Employee employee3 = new Employee("Петрович");

//    public LuggageSpace(Queue<Suitcase> suitcasesList, Employee employee1, Employee employee2, Employee employee3) {
//        this.suitcasesList = suitcasesList;
//        this.employee1 = employee1;
//        this.employee2 = employee2;
//        this.employee3 = employee3;
//    }

    public void planeArrival(String flightNumber) {
        for (int i = 0; i < 20; i++) {
            Suitcase suitcase = new Suitcase(flightNumber, i + 1);
            suitcasesList.add(suitcase);


            System.out.printf("добавлен чемодан № %d, с рейса %s\n", suitcase.getNumber(), suitcase.getFlightNumber());
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

    public void print() {
        System.out.println(suitcasesList.size());
    }


}
//Создать класс багажное отделение, атрибуты: набор чемоданов, 3 работника.
//В классе багажное отделения есть функция: прилет самолета. На вход номер рейса.
//В багажном отделении добавляются 20 чемоданов из этого рейса.
//
//В классе багажное отделение есть функция: разгрузить багажное отделение.
//3 работника по очереди разгружают вещи, в том порядке, в котором происходили прилеты.