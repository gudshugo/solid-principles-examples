package com.solid.principles.second.good;

import com.solid.principles.second.Video;

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
