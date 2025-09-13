public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        BookBuilder builder = new BookBuilder();

        director.makeNovel(builder);
        Book novel = builder.getResult();
        System.out.println(novel);

        director.makeTextbook(builder);
        Book textbook = builder.getResult();
        System.out.println(textbook);

        }
    }
