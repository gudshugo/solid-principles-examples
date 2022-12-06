package src.main.principles.dip.bad;

import lombok.Data;

/**
 * @author Hugo Gois
 */

/*
  Dependency Inversion principle case:
  Let's say that a book store ask us to implement a new feature that enables customers to put their favorite books
  on a shelf.

  To do that, we created a lower-level Book class. There are two methods: the first one is "seeReviews()" that allows
  customers to see reviews and the other one is "readSample" that allows customers to read a sample of each book they
  store on their shelves (go to Shelf class).
 */

@Data
public class Book {

    private int bookId;
    private String name;

    public void seeReviews(){
        //implementation here
    }

    public void readSample(){
        //implementation here
    }

}
