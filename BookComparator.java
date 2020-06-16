import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    public int compare(Book book1, Book book2){
        int compareNum;
        Integer book1int = book1.getYear();
        Integer book2int = book2.getYear();
        compareNum = book1.getAuthor().compareTo(book2.getAuthor());
        if(compareNum == 0){
            compareNum = book1.getTitle().compareTo(book2.getTitle());
        }
        if(compareNum == 0){
            compareNum = book1int.compareTo(book2int);
        }
        
        return compareNum;
    }

}
