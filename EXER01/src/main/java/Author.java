/**
 * @author Welinton
 */
public class Author {
    
    private String name;
    Book[] books;

    public Author(String n){
        this.name = n;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }
}
