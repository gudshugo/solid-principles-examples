package principles.lsp.good;

import lombok.Data;
import src.main.principles.ocp.bad.Category;

/**
 * @author Hugo Gois
 */

/*
  In order to achieve Liskov Substitution principle, we are going to use composition. For this, we have created a
  VideoManager class. Every video has a VideoManager declared on its class right now. Then now, we can share
  any kind of method declared in the VideoManager class and the other child classes will call only the method that
  they needed.
 */
@Data
public class VideoManager {

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
