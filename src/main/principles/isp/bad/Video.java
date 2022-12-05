package src.main.principles.isp.bad;

import lombok.Data;
import src.main.principles.ocp.bad.Category;

/**
 * @author Hugo Gois
 */

/*
 Interface segregation case:
 Let's use the same PremiumVideo and Video classes examples. The Video class needs to implement both methods inside
 the interface (go to PremiumVideo class).
 */
@Data
public class Video implements IVideoActions{

    private String title;
    private int time;
    private int likes;
    private int views;
    private Category category;

    @Override
    public double getNumberOfHoursPlayed() {
        return 0;
    }

    @Override
    public void playRandomAd() {
        //add logic behind playRandomAd method.
    }
}
