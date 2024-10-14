public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", "L.Tolstoy", 1863);
        Autor autor1 = new Autor("Alexander", "Pushkin");
        Book book2 = new Book("Capitan'S dauter", "A. Pushkin", 1836);
        Autor autor2 = new Autor("Leo", "Tolstoy");

        System.out.println("Книга 1 = " + book1.getName() + "; " + book1.getAutor() + " " + book1.getYearOfPublication());
        System.out.println("Автор = " + autor1.getFirstName() + " " + autor1.getSecondName());
        System.out.println("Книга 2 = " + book2.getName() + "; " + book2.getAutor() + " " + book2.getYearOfPublication());
        System.out.println("Автор = " + autor2.getFirstName() + " " + autor2.getSecondName());
        System.out.println("================");

        System.out.println("Изменённые даты публикации");
        book1.setYearOfPublication(2009);
        book2.setYearOfPublication(2009);
        System.out.println("Книга 1 = " + book1.getName() + "; " + book1.getAutor() + " " + book1.getYearOfPublication());
        System.out.println("Книга 2 = " + book2.getName() + "; " + book2.getAutor() + " " + book2.getYearOfPublication());
    }
}