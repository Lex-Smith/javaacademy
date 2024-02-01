package module_2_3.homework3.task2;

import module_2_3.homework3.task2.fruits.Apple;
import module_2_3.homework3.task2.fruits.Apricot;

public class Runner {

    public static void main(String[] args) {

        Garden<Apple> appleGarden = Apple::new;
        Garden<Apricot> apricotGarden = Apricot::new;
        Apple apple = appleGarden.getFruit();
        Apricot apricot = apricotGarden.getFruit();
        System.out.println(apple.getClass());
        System.out.println(apricot.getClass());
    }
}