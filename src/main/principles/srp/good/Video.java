package src.main.principles.srp.good;

import lombok.Data;

/**
 * @author Hugo Gois
 */

/*
  Right now, refactoring the code, we can that the Video class has only attributes and methods
  of its responsibility.
 */

@Data
public class Video {

    private String title;
    private int time;
    private int likes;
    private int views;

    public double getNumberOfHoursPlayed() {
        return (time / 3600.0) * views;
    }

}
