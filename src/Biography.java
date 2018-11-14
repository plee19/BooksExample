public class Biography implements Book {
    String subject;
    int pages;

    public Biography() {
        subject = "Alexander Hamilton";
        pages = 550;
    }

    @Override
    public void displayBook() {
        System.out.println("The book about " + subject + " is " + pages + " pages long.");
    }
}
