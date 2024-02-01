package module_2_3.homework3.task5;

public class Runner {
    public static void main(String[] args) {
        Ruler<Boat, Integer> boatRuler = Boat::getLength;
        Boat boat = new Boat(425);
        Integer boatLength = boatRuler.measure(boat);
        System.out.printf("Длинна лодки: %dм.\n", boatLength);

        Ruler<Animal, Integer> animalRuler = Runner::fullAnimalLength;
        Animal animal = new Animal(56, 28);
        Integer animalLength = animalRuler.measure(animal);
        System.out.printf("Длинна животного: %dсм.\n", animalLength);
    }

    private static int fullAnimalLength(Animal animal) {
        return animal.getBodyLength() + animal.getTailLength();
    }
}