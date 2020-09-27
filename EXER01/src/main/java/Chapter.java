/**
 * @author Welinton
 */
public class Chapter{

    private Integer number;
    Book book;

    public Chapter(Book book, Integer num){
        this.number = num;
        this.book = book;
    }

    public Integer getNumber(){
        return this.number;
    }

    public void setNumber(Integer num){
        this.number = num;
    }

}