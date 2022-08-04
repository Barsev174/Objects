public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Author nikolayGogol = new Author("Николай","Гоголь");
        Book bookOne = new Book(levTolstoy, "Война и мир", 2000);
        Book bookTwo = new Book(nikolayGogol, "Мертвые души", 1966);
        System.out.println("bookOne.author.toString() = " + bookOne.author.toString());
        System.out.println("bookOne.yearOfPublication = " + bookOne.yearOfPublication);
        bookOne.setYearOfPublication(1960);
        System.out.println("bookOne.yearOfPublication = " + bookOne.yearOfPublication);

    }
}