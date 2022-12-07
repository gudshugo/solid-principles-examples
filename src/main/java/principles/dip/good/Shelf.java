package principles.dip.good;

import lombok.Data;

/**
 * @author Hugo Gois
 */

/*
 Dependency Inversion principle case:
 Now, Shelf can reference the Product interface instead of its implementations (Book and DVD).
 The modification allows us to later introduce new product types as well (like Magazines).
 */
@Data
public class Shelf {

    private int shelfId;
    private int capacity;

    private Product product;

    public void addProduct(Product product){
        //implementation here
    }

    public void customizeShelf(){
        //implementation here
    }

}
