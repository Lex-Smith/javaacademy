package module_2_3.homework1.task1;

public class Runner {

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Алекс");
        Dog dog = new Dog("Шарик");
        Bird bird = new Bird("Попка");
        Zoo<Tiger, Dog, Bird> zoo = new Zoo<>(tiger, dog, bird);

        Tiger tiger1 = zoo.getAnimal();
        tiger1.roars();
        Dog dog1 = zoo.getAnimal1();
        dog1.bark();
        Bird bird1 = zoo.getAnimal2();
        bird1.fly();
    }
}
