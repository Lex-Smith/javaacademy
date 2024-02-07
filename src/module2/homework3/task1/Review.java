package module2.homework3.task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Review {
    private int id;
    private String reviewText;
    private int numberOfLikes;
    private LocalDateTime dateTime;
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");


    public Review(int id, String reviewText, int numberOfLikes, String dateTimeStr) {
        this.id = id;
        this.reviewText = reviewText;
        this.numberOfLikes = numberOfLikes;
        this.dateTime = LocalDateTime.parse(dateTimeStr, formatter);
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getInfo() {
        String dateTimeStr = dateTime.format(formatter);
        return id + ", "
                + reviewText + ", "
                +  numberOfLikes + ", "
                + dateTimeStr;
    }

    @Override
    public String toString() {
        String dateTimeStr = dateTime.format(formatter);
        return id + ", "
                + reviewText + ", "
                +  numberOfLikes + ", "
                + dateTimeStr;
    }
}