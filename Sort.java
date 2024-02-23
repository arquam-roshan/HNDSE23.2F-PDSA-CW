public class Sort {
    public static LinkedList sortByTitle(LinkedList list) {

        Node head = list.head;
        Node tail = list.tail;

        if (head == null || tail == null)
            return null;

        boolean swapped;
        Node lastNode = null;

        do {
            swapped = false;
            Node current = head;

            while (current.next != lastNode) {
                if (current.title.compareToIgnoreCase(current.next.title) > 0) {
                    Sort.swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
            lastNode = current;
        } while (swapped);

        return list;
    }

    public static LinkedList sortByIsbn(LinkedList list) {

        Node head = list.head;
        Node tail = list.tail;

        if (head == null || tail == null) {
            return null;
        }

        Node lastNode = null;
        boolean swapped;

        do {
            swapped = false;
            Node current = head;

            while (current.next != lastNode) {
                if (current.ISBN.compareToIgnoreCase(current.next.ISBN) > 0) {
                    swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
            lastNode = current;
        } while (swapped);

        return list;
    }

    private static void swap(Node current, Node next) {
        String tempTitle = current.title;
        String tempISBN = current.ISBN;
        String tempAuthor = current.author;
        String tempPublisher = current.publisher;

        current.title = next.title;
        current.ISBN = next.ISBN;
        current.author = next.author;
        current.publisher = next.publisher;

        next.title = tempTitle;
        next.ISBN = tempISBN;
        next.author = tempAuthor;
        next.publisher = tempPublisher;
    }
}
