package module2.homework4.task2;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<String> words = List.of("тонь", "тополь", "боль", "рой", "стройка");
        words.stream().map(word -> calculateNumberOfO(word))
                .reduce((a, b) -> a + b)
                .ifPresent(e -> ifNoO(e));
    }

    private static long calculateNumberOfO(String word) {
        return word.chars().mapToObj((i) -> (char) i)
                .filter(letter -> letter == 'о')
                .count();
    }

    private static void ifNoO(Long num) {
        if (num == 0) {
            throw new RuntimeException();
        }
        System.out.println(num);
    }
}