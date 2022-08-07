public class Book {
    private final String title;
    int yearOfPublication;
    Author author;

    public Book(Author author, String title, int yearOfPublication) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public Author getAuthor() {
        return  this.author;
    }
    public String getTitle () {
        return  this.title;
    }


    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication ) {
        this.yearOfPublication = yearOfPublication;
    }
    @Override
    public String toString() {
        return author + ":" +
                title + ":" + yearOfPublication;

    }
}
