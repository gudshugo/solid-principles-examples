package principles.isp.good;

import lombok.Data;
import src.main.principles.ocp.bad.Category;

/**
 * @author Hugo Gois
 */

/*
 Interface segregation case:
 The same will be for the Video class. As the Video class needs to implement both methods (playRandomAd and getNumberOfHoursPlayed),
 then, it will implement both interfaces that contain each method.
 */

@Data
public class Video implements IVideoActions, IAdsActions {

    private String title;
    private int time;
    private int likes;
    private int views;
    private Category category;

    @Override
    public void playRandomAd() {
        //add logic behind playRandomAd method.
    }

    @Override
    public double getNumberOfHoursPlayed() {
        return 0;
    }
}
