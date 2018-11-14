public class BookFactory {
    public Book getBook(BookType bookType) {
        switch (bookType) {
            case FICTION:
                return new Fiction();
            case GRAPHICNOVEL:
                return new GraphicNovel();
            case BIOGRAPHY:
                return new Biography();
            default:
                return null;
        }
    }
}
