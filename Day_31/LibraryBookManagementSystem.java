class Book {
    private String bookTitle;
    private String authorName;
    private double price;

    public void setBookDetails(String bookTitle, String authorName, double price) {
        if (bookTitle == null || bookTitle.isEmpty()) {
            System.out.println("Book title cannot be empty");
        } else {
            this.bookTitle = bookTitle;
        }

        this.authorName = authorName;

        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Book Price");
        }
    }

    public void displayBookDetails() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: " + price);
    }
}

public class LibraryBookManagementSystem {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.setBookDetails("Java Programming", "James Gosling", 450);
        b1.displayBookDetails();
    }
}