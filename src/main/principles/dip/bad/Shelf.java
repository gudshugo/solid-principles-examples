package src.main.principles.dip.bad;

import lombok.Data;

/**
 * @author Hugo Gois
 */

/*
 Dependency Inversion principle case:
 The shelf class will let the customers add a book to their shelf (addBook()) and customize the shelf (customizeShelf()).

 But there's a problem with this implementation.
 The dependency inversion principle says that high-level classes (Shelf class) shouldn't depend on lower-level classes
 (Book class). This becomes clear when the store asks us to enable customers to add DVDs to their shelves, for example.
 In order to make the code work properly, we will also need to modify the Shelf class to accept Dvds as well.
 So, it breaks both Dependency Inversion and Open-closed principle.

 */

@Data
public class Shelf {

    private int shelfId;
    private int capacity;
    private Book book;

    public void addBook(Book book){
        //implementation here
    }

    public void customizeShelf(){
        //implementation here
    }

}
