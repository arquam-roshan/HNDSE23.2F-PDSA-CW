class Node {

    String title;
    String ISBN;
    String author;
    String publisher;
    Node prev;
    Node next;

    public Node(String title, String ISBN, String author, String publisher) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.publisher = publisher;
        this.prev = null;
        this.next = null;
    }

}

public class LinkedList {

    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void insert(String title, String ISBN, String author, String publisher) {

        Node node = new Node(title, ISBN, author, publisher);
        if (head == null) {
            head = node;
            tail = node;

        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;

        }

    }

    public void display() {
        Node current = head;
        System.out.println("Books: ");
        while (current != null) {

            System.out.println("Title: " + current.title);
            System.out.println("ISBN: " + current.ISBN);
            System.out.println("Author: " + current.author);
            System.out.println("Publisher: " + current.publisher);
            System.out.println();
            current = current.next;
        }
    }

    public int size() {
        Node n = head;
        int i = 0;
        while (n.next != null) {
            n = n.next;
            i++;
        }
        i += 1;
        return i;
    }

    public void delete() {// delete from tail
        if (head != null) {
            Node previous = null;
            Node start = head;
            while (start.next != null) {
                previous = start;
                start = start.next;
            }
            if (previous != null) {
                previous.next = null;
            } else {
                head = null;
            }
        }
    }

    public void delete(String isbn) {
        if (head != null) {
            Node current = head;
            Node previous = null;
            while (current != null && !current.ISBN.equals(isbn)) {
                previous = current;
                current = current.next;
            }
            if (current.prev == null) {
                head = current.next;
            } else {
                previous.next = current.next;
            }
        }
    }

    // public void delete(String isbn) {
    // if (head != null) {
    // Node current = head;
    // Node previous = null;
    // while (current != null && !current.ISBN.equals(isbn)) {
    // previous = current;
    // current = current.next;
    // }
    // if (current.prev == null) {
    // head = current.next;
    // } else {
    // previous.next = current.next;
    // // current.next.prev = previous;
    // }
    // }

    // }

    public void updateTitle(String isbn, String Title) {
        Node current = head;
        while (!current.ISBN.equals(isbn)) {
            current = current.next;
        }
        current.title = Title;
    }

    public void updateAouthor(String isbn, String Aouthor) {
        Node current = head;
        while (!current.ISBN.equals(isbn)) {
            current = current.next;
        }
        current.author = Aouthor;
    }

    public void updatePublisher(String isbn, String Publisher) {
        Node current = head;
        while (!current.ISBN.equals(isbn)) {
            current = current.next;
        }
        current.publisher = Publisher;
    }
}
