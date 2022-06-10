public class Book {
    String nameOfTheBook;
    String author;
    int publicationYear;

    public Book(String nameOfTheBook, String author, int publicationYear) {
        this.nameOfTheBook = nameOfTheBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
