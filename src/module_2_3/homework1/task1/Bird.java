package module_2_3.homework1.task1;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("Птица " + name + " летит");
    }
}