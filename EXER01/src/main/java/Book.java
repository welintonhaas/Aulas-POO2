/**
 * @author Welinton
 */
public class Book {

    private String ISBN;
    Author author;
    Library library;
    Chapter[] chapters;

    public static void main(String[] args) {
    
        Book B1 = new Book();
        Author A1 = new Author("Samuka");
        Chapter C1 = new Chapter(B1, 1);
        Library L1 = new Library("Biblio do IFSC");

    }

    public String getISBN(){
        return this.ISBN;
    }

    public void setISBN(String isbn){
        this.ISBN = isbn;
    }
        
}
