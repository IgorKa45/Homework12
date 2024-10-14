public class Book {
    private String name;
    private String autor;
    private int yearOfPublication;

    public Book(String name, String autor, int yearOfPublication) {
        this.name = name;
        this.autor = autor;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
