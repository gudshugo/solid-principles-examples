package src.main.principles.isp.good;

import lombok.Data;

/**
 * @author Hugo Gois
 */

/*
  Interface segregation case:
  Right now that we have created two specific interfaces, we can implement only the ones that will be used by the
  respective class. In this case, the PremiumVideo will implement only the one that has the getNumberOfHoursPlayed
  method.
 */

@Data
public class PremiumVideo implements IVideoActions {

    private int premiumId;


    @Override
    public double getNumberOfHoursPlayed() {
        return 0;
    }
}
