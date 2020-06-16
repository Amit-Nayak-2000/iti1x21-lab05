public class Book {

    String author;
    String title;
    int year;

    public Book (String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public boolean equals(Object other) {
        

        if(!(other instanceof Book) || other == null){
            return false;
        }
        
        Book otherBook = (Book) other;
    
        if(this.getAuthor() != otherBook.getAuthor() || this.getTitle() != otherBook.getTitle() || this.getYear() != otherBook.getYear()){
            if(this.author == null){
                if(otherBook.author != null){
                    return false;
                }
            }

            if(this.title == null){
                if(otherBook.title != null){
                    return false;
                }
            }

            if(this.getAuthor().equals(otherBook.getAuthor()) && this.getTitle().equals(otherBook.getTitle()) && this.getYear() == otherBook.getYear()){
                return true;
            }
            return false;
        }
       
       
       
        

        return true;
    }

    public String toString() {
        return "Author: " + title +" (" + year + ")";
    }
}
