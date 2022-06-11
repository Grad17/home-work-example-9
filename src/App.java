public class App {

    private static Author Author;

    public static void main(String[] args) {

        Book book1 = new Book("Пикник на обочине", Author, 2019);
        Book book2 = new Book("Плоская земля", Author, 2020);

        Author author2 = new Author("Дарья ", "Кова");
        Author author1 = new Author("Аркадий и Бориc", "Стругацкие");

        book1.setPublicationYear(2020);

        System.out.println(book1.getNameOfTheBook() + ", " + author1.getFirstName() + " " + author1.getLastName() + ", " + book1.getPublicationYear());
        System.out.println(book2.getNameOfTheBook() + ", " + author2.getFirstName() + " " + author2.getLastName() + ", " + book2.getPublicationYear() + ". (Не рекомендую к чтению)");

//        System.out.println(book1.getPublicationYear());
    }
}
