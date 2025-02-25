import storeBookDetails.StoreBookDetails;

public class Main {
    public static void main(String[] args) {
        StoreBookDetails book = new StoreBookDetails("Fiction", 12345, "The Great Gatsby", "F. Scott Fitzgerald", "Maxwell Perkins");
        book.display();
    }
}