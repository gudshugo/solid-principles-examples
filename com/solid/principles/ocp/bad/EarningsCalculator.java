package com.solid.principles.ocp.bad;

import com.solid.principles.ocp.Video;

/**
 * @author Hugo Gois
 */

/*
  So, we have created a EarningCalculator class that has a switch statement with all the cases of earnings and each
  case calls a method that calculates the earnings by category.

  The problem with this implementation is that whenever we have a different type of earning to implement, we need to add
  a new method that calculates these values and also adds a new statement in the switch case block. Which means that,
  we aren't following the Open Closed principle because it says that the class should be open for "extensions" and
  closed for modifications.
 */

public class EarningsCalculator {

    public double calculateEarnings(Video video){
        return switch(video.getCategory()){
            case EDUCATIONAL -> calculateEducationalEarnings(video);
            case GAMING -> calculateGamingEarnings(video);
            case ENTERTAINMENT -> calculateEntertainmentEarnings(video);
        };
    }

    private double calculateEducationalEarnings(Video video){
        return video.getLikes() * 0.033 + video.getViews() * 0.032;
    }

    private double calculateGamingEarnings(Video video){
        return video.getLikes() * 0.023 + video.getViews() * 0.045;
    }

    private double calculateEntertainmentEarnings(Video video){
        return video.getLikes() * 0.018 + video.getViews() * 0.042;
    }

}
