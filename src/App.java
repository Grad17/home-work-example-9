public class App {

    public static void main(String[] args) {

        Book book1 = new Book("Пикник на обочине", "", 2019);
        Book book2 = new Book("Плоская земля", "", 2020);

        Author author2 = new Author("Дарья ", "Кова");
        Author author1 = new Author("Аркадий и Бориc", "Стругацкие");

        book1.setPublicationYear(2020);

        System.out.println(book1.nameOfTheBook + ", " + author1.firstName + " " + author1.lastName + ", " + book1.publicationYear);
        System.out.println(book2.nameOfTheBook + ", " + author2.firstName + " " + author2.lastName + ", " + book2.publicationYear + ". (Не рекомендую к чтению)");

//        System.out.println(book1.getPublicationYear());
    }
}
