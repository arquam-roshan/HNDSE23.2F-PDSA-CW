
import java.util.Scanner;

public class Search {
    public static void searchAll(LinkedList list) {

        System.out.println();

        list.display();

    }

    public static void searchByIsbn(LinkedList list) {
        System.out.println("Enter ISBN number:");
        Scanner sc = new Scanner(System.in);
        String isbn = sc.next();

        Node temp = list.head;

        System.out.println();

        for (; temp != null; temp = temp.next) {

            if (temp.ISBN.equals(isbn)) {
                System.out.println("ISBN: " + temp.ISBN);
                System.out.println("Title: " + temp.title);
                System.out.println("Author: " + temp.author);
                System.out.println("publisher: " + temp.publisher);

                break;
            }
        }
    }

    public static void searchByTitle(LinkedList list) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title of the book you want to search: ");
        String title = sc.nextLine();

        System.out.println();

        Node temp = list.head;

        int[] edition = new int[10];
        Node[] book = new Node[edition.length];

        int i = 0;

        // store all the books with the same titles in a book array
        for (; temp != null; temp = temp.next) {

            if (temp.title.toLowerCase().equals(title.toLowerCase())) {
                book[i] = temp;
                i++;
            }
        }

        // print all the books that are in the array
        for (int j = 0; j < book.length; j++) {

            if (book[j] == null) {
                break;
            }
            System.out.println("ISBN: " + book[j].ISBN);
            System.out.println("Title: " + book[j].title);
            System.out.println("Author: " + book[j].author);
            System.out.println("publisher: " + book[j].publisher);

            System.out.println("");
            System.out.println("");
        }
    }

    public static void searchByAuthor(LinkedList list) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        Node temp = list.head;

        System.out.println();

        int count = 0;

        for (; temp != null; temp = temp.next) {
            if (temp.author.toLowerCase().equals(author.toLowerCase())) {
                count++;
            }
        }
        System.out.println("Number of books: " + count);

        Node[] book = new Node[count];
        temp = list.head;

        for (int i = 0; temp != null; temp = temp.next) {
            if (temp.author.toLowerCase().equals(author.toLowerCase())) {
                book[i] = temp;
                i++;
            }
        }

        for (int j = 0; j < book.length; j++) {

            if (book[j] == null) {
                break;
            }
            System.out.println("ISBN: " + book[j].ISBN);
            System.out.println("Title: " + book[j].title);
            System.out.println("Author: " + book[j].author);
            System.out.println("publisher: " + book[j].publisher);

            System.out.println();
            System.out.println();
        }

    }

    public static void searchByPublisher(LinkedList list) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Publisher name: ");
        String publisher = sc.nextLine();

        System.out.println();

        Node temp = list.head;

        int count = 0;

        for (; temp != null; temp = temp.next) {
            if (temp.publisher.toLowerCase().equals(publisher.toLowerCase())) {
                count++;
            }
        }

        Node[] book = new Node[count];
        temp = list.head;

        for (int i = 0; temp != null; temp = temp.next) {
            if (temp.publisher.toLowerCase().equals(publisher.toLowerCase())) {
                book[i] = temp;
                i++;
            }
        }

        for (int j = 0; j < book.length; j++) {

            if (book[j] == null) {
                break;
            }
            System.out.println("ISBN: " + book[j].ISBN);
            System.out.println("Title: " + book[j].title);
            System.out.println("Author: " + book[j].author);
            System.out.println("publisher: " + book[j].publisher);

            System.out.println();
            System.out.println();
        }

    }
}
