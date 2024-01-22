package module_2_3.homework1.task1;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Собака " + name + " лает");
    }
}
