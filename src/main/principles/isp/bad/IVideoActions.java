package src.main.principles.isp.bad;

/**
 * @author Hugo Gois
 */

/*
  Interface segregation case:
  This interface was created to be implemented by the Video and PremiumVideo classes.
 */
public interface IVideoActions {

    double getNumberOfHoursPlayed();
    void playRandomAd();

}
