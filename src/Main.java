import java.util.Arrays;


public class Main {
    private static Book[] listOfBook = new Book[10];

    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Author nikolayGogol = new Author("Николай", "Гоголь");
        Book bookOne = new Book(levTolstoy, "Война и мир", 2000);
        Book bookTwo = new Book(nikolayGogol, "Мертвые души", 1966);
        Book bookTree = new Book(levTolstoy, "Детство", 1900);
        System.out.println("bookOne.author.toString() = " + bookOne.author.toString());
        System.out.println("bookOne.yearOfPublication = " + bookOne.yearOfPublication);
        bookOne.setYearOfPublication(1960);
        System.out.println("bookOne.yearOfPublication = " + bookOne.yearOfPublication);

        listOfBook[0] = bookOne;
        listOfBook[1] = bookTwo;

        putTheBookDown(bookTree);

        System.out.println(Arrays.toString(listOfBook));

    }

    public static void putTheBookDown(Book book) {
        for (int i = 0; i < listOfBook.length - 1; i++) {
            if (listOfBook[i] == null) {
                listOfBook[i] = book;
                break;
            }
        }
    }
}


