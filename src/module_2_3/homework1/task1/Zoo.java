package module_2_3.homework1.task1;

public class Zoo<A extends Animal, B extends Animal, C extends Animal> {
    private A animal;
    private B animal1;
    private C animal2;

    public Zoo(A animal, B animal1, C animal2) {
        this.animal = animal;
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public A getAnimal() {
        return animal;
    }

    public B getAnimal1() {
        return animal1;
    }

    public C getAnimal2() {
        return animal2;
    }
}
