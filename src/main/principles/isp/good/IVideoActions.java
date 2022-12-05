package src.main.principles.isp.good;

/**
 * @author Hugo Gois
 */

/*
  Interface segregation case:
  This interface will contain only video actions. So, right now, we have a specific interface instead
  of a generic one.
 */

public interface IVideoActions {

    double getNumberOfHoursPlayed();

}
