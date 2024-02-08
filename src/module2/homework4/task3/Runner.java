package module2.homework4.task3;

import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        Skyscraper skyscraper1 = new Skyscraper("Всемирный торговый центр 1", 541);
        Skyscraper skyscraper2 = new Skyscraper("Шанхайская башня", 632);
        Skyscraper skyscraper3 = new Skyscraper("Бурдж-Халифа", 828);
        Skyscraper skyscraper4 = new Skyscraper("Международный финансовый центр Пинань", 599);
        Skyscraper skyscraper5 = new Skyscraper("Абрадж аль-Бейт", 601);
        Skyscraper skyscraper6 = new Skyscraper("Всемирный центр Лотте", 555);

        List<Skyscraper> skyscrapers = List.of(skyscraper1, skyscraper1, skyscraper2,
                skyscraper3, skyscraper4, skyscraper5, skyscraper6);

        List<Skyscraper> uniqueSkyscrapers = skyscrapers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("первые три небоскреба:");
        uniqueSkyscrapers.stream()
                .limit(3)
                .forEach(skyscraper -> System.out.println(skyscraper));

        System.out.println("_______________________");
        System.out.println("самый высокий небоскреб: "
                + uniqueSkyscrapers.stream()
                .max((skyscrap1, skyscrap2) -> skyscrap1.getHeight() - skyscrap2.getHeight())
                .orElseThrow());

        System.out.println("_______________________");
        System.out.println("небоскребы, которые выше километра:");
        uniqueSkyscrapers.stream()
                .filter(skyscraper -> skyscraper.getHeight() > 1000)
                .findFirst()
                .ifPresentOrElse(skyscraper -> System.out.println(skyscraper),
                        () -> System.out.println("небоскреба выше километра - нет"));
    }
}