package principles.ocp.good;

import src.main.principles.ocp.Video;

/**
 * @author Hugo Gois
 */

/*
    Now we have a single class that calculates gaming earnings based on the interface method.
    If, for some reason, we need to modify other types of categories earnings, this class won't be affected.
 */

public class GamingEarningsCalculator implements IEarningsCalculator{

    @Override
    public double calculateEarnings(Video video){
        return video.getLikes() * 0.023 + video.getViews() * 0.045;
    }

}
