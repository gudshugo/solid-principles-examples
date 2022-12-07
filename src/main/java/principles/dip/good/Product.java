package principles.dip.good;

/**
 * @author Hugo Gois
 */

/*
  The solution is to create an abstraction layer for the lower-level classes (Books and DVD). We'll do so by
  introducing the Product interface and both classes will implement it.
 */

public interface Product {

    void seeReviews();
    void getSample();

}
