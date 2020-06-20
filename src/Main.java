/**
 * This main method is used to run the entire program.
 */

public class Main {
    /**
     * @param args the command line argument.
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList ();
        list.Insert ( 2 );
        list.Insert ( 1 );
        list.Insert ( 8 );
        list.InsertAtFirst ( 4 );
        list.InsertAt ( 3,55 );
        list.DeleteAt ( 2 );
        System.out.println ("The Linked List are :");
        list.Display ();
    }
}
