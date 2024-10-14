public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Alexander", "Pushkin");
        Author tolstoy = new Author("Leo", "Tolstoy");
        Book book1 = new Book("War and Peace", tolstoy,1868);
        Book book2 = new Book("Capitan'S dauter", pushkin, 1836);
        System.out.println("Книга 1 = " + book1.getName() + "; " + tolstoy.getFirstName() + " " + tolstoy.getSecondName() + " " + book1.getYearOfPublication());
        System.out.println("Книга 2 = " + book2.getName() + "; " + pushkin.getFirstName() + " " + pushkin.getSecondName() + " " + book2.getYearOfPublication());
        System.out.println("================");

        System.out.println("Изменённые даты публикации");
        book1.setYearOfPublication(2009);
        book2.setYearOfPublication(2009);
        System.out.println("Книга 1 = " + book1.getName() + "; " + tolstoy.getFirstName() + " " + tolstoy.getSecondName() + " " + book1.getYearOfPublication());
        System.out.println("Книга 2 = " + book2.getName() + "; " + pushkin.getFirstName() + " " + pushkin.getSecondName() + " " + book2.getYearOfPublication());
    }
}