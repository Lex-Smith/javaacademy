package module2.homework3.task5;

public class Runner {
    public static void main(String[] args) {
        Ruler<Boat> boatRuler = Boat::getLength;
        Integer boatLength = boatRuler.measure(new Boat(425));
        System.out.printf("Длинна лодки: %dм.\n", boatLength);

        Ruler<Animal> animalRuler = Runner::fullAnimalLength;
        Integer animalLength = animalRuler.measure(new Animal(56, 28));
        System.out.printf("Длинна животного: %dсм.\n", animalLength);
    }

    private static int fullAnimalLength(Animal animal) {
        return animal.getBodyLength() + animal.getTailLength();
    }
}