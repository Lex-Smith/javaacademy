package module2.homework3.task3;

public class Runner {

    private static final int FORTUNETELLERCONST = 210;

    public static void main(String[] args) {

        Divination<Human> chamomile = human -> {
            if (human.getName().length() % 2 == 0) {
                return true;
            }
            return false;
        };
        Divination<Human> fortuneTeller = human -> {
            if (ageLengthSumm(human) > FORTUNETELLERCONST) {
                return true;
            }
            return false;
        };
        Human human = new Human("Alex", 39, 178);
        System.out.printf("Ромашка говорит: %s\n", chamomile.guess(human));
        System.out.printf("Бабака гадалка говорит: %s\n", fortuneTeller.guess(human));
    }

    private static int ageLengthSumm(Human human) {
        return human.getAge() + human.getHeight();
    }
}