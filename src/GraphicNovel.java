public class GraphicNovel implements Book {
    String title;
    int pages;
    String artist;

    public GraphicNovel() {
        title = "Spiderman";
        pages = 50;
        artist = "Stan Lee";
    }

    @Override
    public void displayBook() {
        System.out.println(title + " is " + pages + " pages long, illustrated by " + artist + ".");
    }
}
