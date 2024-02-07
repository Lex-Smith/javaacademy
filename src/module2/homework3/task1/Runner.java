package module2.homework3.task1;

import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {

        Review review1 = new Review(1, "отличный товар", 200, "25.01.2024 13:37");
        Review review2 = new Review(2, "так себе товар", 100, "25.01.2024 16:37");
        Review review3 = new Review(3, "плохой товар", 100, "25.01.2024 13:37");
        TreeSet<Review> reviews = new TreeSet<>((o1, o2) -> {
            int result = o2.getNumberOfLikes() - o1.getNumberOfLikes();
            if (result == 0) {
                result = o1.getDateTime().compareTo(o2.getDateTime());
            }
            return result;
        });
        reviews.add(review1);
        reviews.add(review2);
        reviews.add(review3);

        printReviews(reviews);
    }

    private static void printReviews(TreeSet reviews) {
        AtomicInteger count = new AtomicInteger(1);
        System.out.println("           id, текст, кол-во лайков, дата+время");
        Stream<Review> stream = reviews.stream();
        stream.forEach(review -> {
            System.out.printf("отзыв №%s: %s\n", count, review.getInfo());
            count.getAndIncrement();
        });
    }
}