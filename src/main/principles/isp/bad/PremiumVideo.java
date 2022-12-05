package src.main.principles.isp.bad;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Hugo Gois
 */

/*
  Interface segregation case:
  On the other hand, the PremiumVideo class only needs to implement the getNumberOfHoursPlayed() because as a premium
  video, it doesn't need to play advertisement.

  So, we have a problem here. That goes into to the Interface Segregation principle. Instead of using generic interfaces,
  the principle says that we should create specific ones.
 */

@Data
public class PremiumVideo implements IVideoActions{

    private int premiumId;

    @Override
    public double getNumberOfHoursPlayed() {
        return 0;
    }

    @Override
    public void playRandomAd() {
        //add logic behind playRandomAd method.
    }

}
