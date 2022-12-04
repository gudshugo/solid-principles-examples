package src.main.principles.lsp.good;

import lombok.Data;

/**
 * @author Hugo Gois
 */

/*
  Now, the Video class doesn't need to implement methods that won't use.
 */

@Data
public class Video {

    private VideoManager videoManager;

    public double getNumberOfHoursPlayed(){
        return videoManager.getNumberOfHoursPlayed();
    }

    public void playRandomAd() throws Exception {
        videoManager.playRandomAd();
    }

}
