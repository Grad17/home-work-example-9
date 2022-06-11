public class Book {
    private final String nameOfTheBook;
    private final Author author;
    private int publicationYear;

    public Book(String nameOfTheBook, Author author, int publicationYear) {
        this.nameOfTheBook = nameOfTheBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
