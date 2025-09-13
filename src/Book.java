public class Book {
    private String title;
    private String author;
    private int pages;
    private String genre;
    private String language;
    private String publisher;

    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setPages(int pages) {this.pages = pages;}
    public void setGenre(String genre) {this.genre = genre;}
    public void setLanguage(String language) {this.language = language;}
    public void setPublisher(String publisher) {this.publisher = publisher;}

    @Override
    public String toString() {
        return "\n Information about book " +
                "\n------------------------\n" +
                " Title     : " + title +
                "\n Author    : " + author +
                "\n Pages     : " + pages +
                "\n Genre     : " + genre +
                "\n Language  : " + language +
                "\n Publisher : " + publisher + "\n";
    }
}
