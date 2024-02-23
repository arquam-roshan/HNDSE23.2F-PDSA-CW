import java.io.CharArrayReader;
import java.util.Scanner;
import java.util.concurrent.Flow;

public class App {

    public static void main(String[] args) {

        LinkedList library = new LinkedList();
        Scanner s = new Scanner(System.in);
        int n;
        String title, ISBN, author, publisher;

         library.insert("Harry Potter and the philosopher's stone", "0001", "J. K. Rowling", "Puffin");
         library.insert("To Kill a Mockingbird", "1234", "Harper Lee",
         "HarperCollins");
         library.insert("1984", "5678", "George Orwell", "Penguin Books");
         library.insert("The Great Gatsby", "9101", "F. Scott Fitzgerald",
         "Scribner");
         library.insert("Pride and Prejudice", "1122", "Jane Austen", "Modern Library");
         library.insert("The Catcher in the Rye", "3344", "J.D. Salinger", "Little, Brown and Company");
         library.insert("The Shadow of the Wind", "1111", "Carlos Ruiz Zafón",
         "PublisherA");
         library.insert("The Night Circus", "2222", "Erin Morgenstern", "PublisherB");
         library.insert("The Alchemist", "3333", "Paulo Coelho", "PublisherC");
         library.insert("The Martian", "4444", "Andy Weir", "Puffin");
         library.insert("The Hunger Games", "5555", "Suzanne Collins", "PublisherE");
         library.insert("Gone Girl", "6666", "Gillian Flynn", "Puffin");
         library.insert("The Da Vinci Code", "7777", "Dan Brown", "PublisherG");
         library.insert("The Girl with the Dragon Tattoo", "8888", "Stieg Larsson",
         "PublisherH");
         library.insert("The Goldfinch", "9999", "Donna Tartt", "PublisherI");
         library.insert("The Help", "0000", "Kathryn Stockett", "PublisherJ");
          library.insert("Gone Girl", "6677", "Gillian Flynn", "PublisherK");
          library.insert("Harry Potter and the Chamber of Secrets", "0002", "J. K. Rowling", "Puffin");
          library.insert("Harry Potter and the Prisoner of Azakaban", "0003", "J. K. Rowling", "Puffin");
          library.insert("Harry Potter and the Goblet of Fire", "0004", "J. K. Rowling", "Puffin");
          library.insert("Harry Potter and the Order of the Phoenix", "0005", "J. K. Rowling", "Puffin");
          library.insert("Harry Potter and the Half-Blood Prince", "0006", "J. K. Rowling", "Puffin");
          library.insert("Harry Potter and the Deathly Hallows", "0007", "J. K. Rowling", "Puffin");

        System.out.println("-----------------------------------------------------------------");
        System.out.println("\t\t\t\t**  Welcome to LB_library  **");
        System.out.println("-----------------------------------------------------------------");

        do {
            System.out.println(
                    "\n\t\t\t\tSelect option 0 to 4.\n\t\t\t\t----------------------  \n0.Exit\n1.Add new book\n2.Update book\n3.Delete existing book\n4.Search book\n5.View books");
            System.out.print("\nEnter an operation to perform: ");
            n = s.nextInt();
            switch (n) {
                case 1:
                    System.out.println("\t\t\tAdd Book");
                    System.out.println("\t\t\t--------\n");
                    System.out.println("\tEnter Book details below.\n");

                    System.out.print("Enter book title: ");
                    s.nextLine();
                    title = s.nextLine();
                    System.out.print("Enter ISBN number: ");
                    ISBN = s.nextLine();
                    System.out.print("Enter author name: ");
                    author = s.nextLine();
                    System.out.print("Enter publisher company name: ");
                    publisher = s.nextLine();
                    library.insert(title, ISBN, author, publisher);
                    break;
                case 2:
                    do {
                        System.out.println("\t\t\tUpdate book");
                        System.out.println("\t\t\t-----------");
                        System.out.println("\n0.Exit\n1.Update title\n2.Update author\n3.Update publisher");
                        System.out.print("\nEnter an operation to perform: ");
                        n = s.nextInt();
                        switch (n) {
                            case 1:
                                System.out.println("\t\t\tUpdate title ");
                                System.out.println("\t\t\t-------------");
                                System.out.print("Enter ISBN number: ");
                                s.nextLine();
                                ISBN = s.nextLine();
                                System.out.print("Enter book title: ");
                                title = s.nextLine();
                                library.updateTitle(ISBN, title);
                                break;
                            case 2:
                                System.out.println("\t\t\tUpdate author");
                                System.out.println("\t\t\t-------------");
                                System.out.print("Enter ISBN number: ");
                                s.nextLine();
                                ISBN = s.nextLine();
                                System.out.println("Enter book author: ");
                                author = s.nextLine();
                                library.updateAouthor(ISBN, author);
                                break;
                            case 3:
                                System.out.println("\t\t\tUpdate publisher");
                                System.out.println("\t\t\t-------------");
                                System.out.print("Enter ISBN number: ");
                                s.nextLine();
                                ISBN = s.nextLine();
                                System.out.print("Enter new publisher name: ");
                                publisher = s.nextLine();
                                library.updatePublisher(ISBN, publisher);
                                break;
                        }
                    } while (n != 0);
                    n = -1;
                    break;
                case 3:
                    System.out.println("\t\t\tDelete Book");
                    System.out.println("\t\t\t-----------");
                    System.out.print("Enter book ISBN number to delete that particular book: ");
                    s.nextLine();
                    ISBN = s.nextLine();
                    library.delete(ISBN);
                    n = -1;
                    break;
                case 4:
                    do {
                        System.out.println("\t\t\tSearch book");
                        System.out.println("\t\t\t-----------");
                        System.out.println(
                                "\n0.Exit\n1.View all books\n2.Search by ISBN\n3.Search by title\n4.Search by author\n5.Search by publisher\n6.View all book by title\n7.view all book by ISBN number");
                        System.out.print("\nEnter an operation to perform: ");
                        n = s.nextInt();
                        switch (n) {
                            case 1:
                                System.out.println("\t\t\tView Book");
                                System.out.println("\t\t\t-----------");
                                Search.searchAll(library);
                                break;
                            case 2:
                                System.out.println("\t\t\tSearch Book by ISBN number");
                                System.out.println("\t\t\t--------------------------");
                                Search.searchByIsbn(library);
                                break;
                            case 3:
                                System.out.println("\t\t\tSearch Book by Title");
                                System.out.println("\t\t\t--------------------");
                                Search.searchByTitle(library);
                                break;
                            case 4:
                                System.out.println("\t\t\tSearch Book by Author");
                                System.out.println("\t\t\t--------------------");
                                Search.searchByAuthor(library);
                                break;
                            case 5:
                                System.out.println("\t\t\tSearch Book by Publisher");
                                System.out.println("\t\t\t------------------------");
                                Search.searchByPublisher(library);
                                break;
                            case 6:
                                System.out.println("\t\t\tSort Book by Title");
                                System.out.println("\t\t\t-------------------");
                                Sort.sortByTitle(library);
                                library.display();
                                break;
                            case 7:
                                System.out.println("\t\t\tSort Book by ISBN number");
                                System.out.println("\t\t\t------------------------");
                                Sort.sortByIsbn(library);
                                library.display();
                                break;
                        }
                    } while (n != 0);
                    n = -1;
                    break;
                case 5:
                    do {
                        System.out.println("\t\t\tView books");
                        System.out.println("\t\t\t-----------");
                        System.out.println(
                                "\n0.Exit\n1.View all Books\n2.Sort Book by Title in alphabetical order\n3.Sort Book by ISBN number");
                        System.out.print("\nEnter an operation to perform: ");
                        n = s.nextInt();
                        switch (n) {
                            case 1:
                                System.out.println("\t\t\tView all Books");
                                System.out.println("\t\t\t-----------");
                                Search.searchAll(library);
                                break;
                            case 6:
                                System.out.println("\t\t\tSort Book by Title in alphabetical order");
                                System.out.println("\t\t\t----------------------------------------");
                                Sort.sortByTitle(library);
                                library.display();
                                break;
                            case 7:
                                System.out.println("\t\t\tSort Book by ISBN number");
                                System.out.println("\t\t\t------------------------");
                                Sort.sortByIsbn(library);
                                library.display();
                                break;
                        }
                    } while (n != 0);
                    n = -1;
                    break;
            }
        } while (n != 0);

    }

}