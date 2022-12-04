package com.solid.principles.ocp.good;

import com.solid.principles.ocp.Video;

/**
 * @author Hugo Gois
 */

/*
    Now we have a single class that calculates entertainment earnings based on the interface method.
    If, for some reason, we need to modify other types of categories earnings, this class won't be affected.
 */

public class EntertainmentEarningsCalculator implements IEarningsCalculator {

    @Override
    public double calculateEarnings(Video video){
        return video.getLikes() * 0.018 + video.getViews() * 0.042;
    }
    
}
