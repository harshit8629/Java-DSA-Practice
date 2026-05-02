class LibraryBook {

    private int copiesAvailable = 5;

    void issueBook() {
        if (copiesAvailable > 0) {
            copiesAvailable--;
        }
    }

    void returnBook() {
        copiesAvailable++;
    }

    int getCopies() {
        return copiesAvailable;
    }

    public static void main(String[] args) {

        LibraryBook book = new LibraryBook();

        book.issueBook();
        book.issueBook();
        book.returnBook();

        System.out.println("Copies Available: " + book.getCopies());
    }
}