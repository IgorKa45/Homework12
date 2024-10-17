public class Main {
    public static void main(String[] args) {
        //Добавим 3-го автора чтоб проверить работу метода equals
        Author pushkin = new Author("Alexander", "Pushkin");
        Author pushkin2 = new Author("Alexander", "Pushkin");
        Author tolstoy = new Author("Leo", "Tolstoy");
        //Добавим 3-ю книгу похожую на вторую чтоб проверить работу метода equals
        Book book1 = new Book("War and Peace", tolstoy,1868);
        Book book2 = new Book("Capitan'S dauter", pushkin, 1836);
        Book book3 = new Book("Capitan'S dauter", pushkin, 1836);
        System.out.println("Книга 1 = " + book1.getName() + "; " + tolstoy.getFirstName() + " " + tolstoy.getSecondName() + " " + book1.getYearOfPublication());
        System.out.println("Книга 2 = " + book2.getName() + "; " + pushkin.getFirstName() + " " + pushkin.getSecondName() + " " + book2.getYearOfPublication());
        System.out.println("================");

        System.out.println("Изменённые даты публикации");
        book1.setYearOfPublication(2009);
        book2.setYearOfPublication(2009);
        System.out.println("Книга 1 = " + book1.getName() + "; " + tolstoy.getFirstName() + " " + tolstoy.getSecondName() + " " + book1.getYearOfPublication());
        System.out.println("Книга 2 = " + book2.getName() + "; " + pushkin.getFirstName() + " " + pushkin.getSecondName() + " " + book2.getYearOfPublication());

        System.out.println();
        System.out.println("Метод toString");

        System.out.println(book1);
        System.out.println(pushkin);

        System.out.println();
        System.out.println("Метод equals");
        System.out.println(pushkin.equals(tolstoy));
        System.out.println(pushkin);

        System.out.println();
        System.out.println("Метод hashcode");
        System.out.println(pushkin.hashCode());
        System.out.println(pushkin2.hashCode());
        System.out.println(tolstoy.hashCode());
    }
}