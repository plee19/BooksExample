public class Fiction implements Book {
    String title;
    int pages;

    public Fiction() {
        title = "Jurassic Park";
        pages = 250;
    }

    @Override
    public void displayBook() {
        System.out.println(title + " is " + pages + " pages long.");
    }
}
