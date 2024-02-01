package module_2_3.homework3.task2;

import module_2_3.homework3.task2.fruits.Fruit;

public interface Garden<T extends Fruit> {
    T getFruit();
}