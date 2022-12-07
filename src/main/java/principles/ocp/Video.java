package principles.ocp;

import lombok.Data;
import src.main.principles.ocp.bad.Category;

/**
 * @author Hugo Gois
 */

/*
   Open-closed principle case:
   Let's say that now we have a new enum "category" referenced in the Video class, and we are going to calculate earnings
   based on each category in another class called EarningsCalculator (in the bad folder).
 */
@Data
public class Video {

    private String title;
    private int time;
    private int likes;
    private int views;
    private Category category;

    public double getNumberOfHoursPlayed() {
        return (time / 3600.0) * views;
    }

}
