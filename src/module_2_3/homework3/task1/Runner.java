package module_2_3.homework3.task1;

import java.util.TreeSet;

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

        printReviws(reviews);
    }

    private static void printReviws(TreeSet reviews) {
        int count = 1;
        System.out.println("           id, текст, кол-во лайков, дата+время");
        for (Object review : reviews) {
            System.out.printf("отзыв №%d: %s\n", count, review);
            count++;
        }
    }
}