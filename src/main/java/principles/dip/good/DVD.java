package principles.dip.good;

import lombok.Data;

/**
 * @author Hugo Gois
 */

/*
Dependency Inversion principle case:
Now, each new type of product will implement an abstract Product interface and override its methods.
 */

@Data
public class DVD implements Product{

    private int dvdId;
    private String name;

    @Override
    public void seeReviews() {
        //implementation here
    }

    @Override
    public void getSample() {
        //implementation here
    }
}
