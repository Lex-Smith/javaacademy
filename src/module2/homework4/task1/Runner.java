package module2.homework4.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger();
        List<Car> cars799 = Stream.generate(() -> new Car("a0"
                        + generateLicensePlate(counter.addAndGet(1)) + "ан799"))
                .limit(50)
                .collect(Collectors.toCollection(ArrayList::new));
        counter.set(0);
        List<Car> cars178 = Stream.generate(() -> new Car("к0"
                        + generateLicensePlate(counter.addAndGet(1)) + "се178"))
                .limit(50)
                .collect(Collectors.toCollection(ArrayList::new));
        String result = Stream.concat(cars799.stream(), cars178.stream())
                .filter(Runner::specialNumbersFilter)
                .map(Car::getLicensePlate)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

    private static String generateLicensePlate(Integer count) {
        String digitsOnPlate = String.valueOf(count);
        if ((int) Math.log10(count) + 1 == 1) {
            digitsOnPlate = "0" + count;
        }
        return digitsOnPlate;
    }

    private static boolean specialNumbersFilter(Car car) {
        boolean isSpacial = false;
        int digitsOnPlate = Integer.parseInt(car.getLicensePlate().substring(2, 4));
        if ((digitsOnPlate >= 40) && (digitsOnPlate <= 49)) {
            isSpacial = true;
        }
        return isSpacial;
    }
}