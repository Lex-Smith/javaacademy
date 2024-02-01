package module_2_3.homework3.task4;

public class Runner {

    public static void main(String[] args) {

        Burning<Uranus> atomicReactor = uranus -> System.out.println("Зеленый свет вокруг!");
        Burning<Wood> bonfire = wood -> System.out.println("желто-красный свет вокруг!");

        Uranus uranus = new Uranus();
        atomicReactor.burn(uranus);
        Wood wood = new Wood();
        bonfire.burn(wood);
    }
}