package com.solid.principles.ocp.good;

import com.solid.principles.ocp.Video;

/**
 * @author Hugo Gois
 */

/*
  Then again, the Open Closed principle says that a class should be open for "extensions". To achieve this,
  we need to use polymorphism and its concepts. We need to create an interface and with that, whenever a new
  earnings calculator class is created, we should implement the interface IEarningsCalculator. With that, we will never
  need to modify existing earnings calculator classes and only implement a new type based on the interface method.
 */
public interface IEarningsCalculator {

    double calculateEarnings(Video video);

}
