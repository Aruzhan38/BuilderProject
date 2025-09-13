public class Director {
    public void makeNovel(Builder builder) {
        builder.reset();
        builder.setTitle("Abay Zholy");
        builder.setAuthor("Mukhtar Auezov");
        builder.setPages(500);
        builder.setGenre("Novel");
        builder.setLanguage("Kazakh");
        builder.setPublisher("Alash");
    }

    public void makeTextbook(Builder builder) {
        builder.reset();
        builder.setTitle("Kazakh History");
        builder.setAuthor("E. Omirbekov");
        builder.setPages(300);
        builder.setGenre("Textbook");
        builder.setLanguage("Kazakh");
        builder.setPublisher("Aikap");
    }
}
