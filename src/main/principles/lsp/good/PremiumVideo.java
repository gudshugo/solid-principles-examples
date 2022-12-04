package src.main.principles.lsp.good;

import lombok.Data;

/**
 * @author Hugo Gois
 */

/*
  Now, the PremiumVideo class doesn't need to implement methods that won't use.
 */

@Data
public class PremiumVideo {

    private int premiumId;
    private VideoManager videoManager;

    public double getNumberOfHoursPlayed(){
        return videoManager.getNumberOfHoursPlayed();
    }

}
