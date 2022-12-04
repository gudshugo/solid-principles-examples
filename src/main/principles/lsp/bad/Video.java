package src.main.principles.lsp.bad;

import lombok.Data;
import src.main.principles.ocp.bad.Category;

/**
 * @author Hugo Gois
 */

/*
 Liskov Substitution principle case:
 Let's say that now we have added a new method in the Video class called playRandomAd() which it will play an
 advertisement during the video execution. Now, go to the new class called PremiumVideo.
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

    public void playRandomAd() throws Exception{
        //method that will be responsible to play an ad during the video execution.
    }

}
