package module2.homework3.task2;

import module2.homework3.task2.fruits.Fruit;

public interface Garden<T extends Fruit> {
    T getFruit();
}