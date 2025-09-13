public class BookBuilder implements Builder{
    private Book book;

    public BookBuilder(){
        this.reset();
    }

    public void reset() {this.book = new Book();}
    public void setTitle(String title) {this.book.setTitle(title);}
    public void setAuthor(String author) {this.book.setAuthor(author);}
    public void setPages(int pages) {this.book.setPages(pages);}
    public void setGenre(String genre) {this.book.setGenre(genre);}
    public void setLanguage(String language) {this.book.setLanguage(language);}
    public void setPublisher(String publisher) {this.book.setPublisher(publisher);}
    public Book getResult() {
        return this.book;
    }
}
