/**
 * This is a Linked List Class.
 * As we know that in Linked list the first element we called as head.
 */

public class LinkedList {
    private Node head;

    /**
     * This method is to insert the data in last position of Linked list.
     * @param data this data in insert in last position.
     */


    public void Insert(int data){
        Node node = new Node ( data ); // created the node reference to storing the value.
        node.next = null;

        if(head == null){
            head = node;
        }else{
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }

    }

    /**
     * This method is used to display the entire Linked List.
     */
    public void Display(){
        System.out.print("[");
        Node n = head;
        while(n != null){
            System.out.print(n.data+ " ");
            n = n.next;
        }
        System.out.print("]");
    }

    /**
     * This method is to insert the data at first position.
     * @param data used to insert in the first position.
     */
    public void InsertAtFirst(int data){
        Node node = new Node ( data ); // created the node reference to storing the value.
        node.next = head;
        head = node;
    }

    /**
     * This method is used to insert the data in middle or any place in the linked List.
     * @param index This is used to enter the value in the particular index.
     * @param data used to insert data in any of the position.
     */
    public void InsertAt(int index , int data){
        Node node = new Node ( data );
        if (index == 0){ // If index value is 0 then it means value inserted in the first position.
            InsertAtFirst ( data ); // This method is used to insert in the first position if the index is 0.
        }else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    /**
     * This method is used to delete data form any given index value.
     * @param index This is used to delete data from the given index.
     */
    public void DeleteAt(int index){
        if(index  == 0){    // if Index is 0 then head is pointing towards the next element.
            head = head.next;
        }else{
            Node n = head;
            for (int i = 0; i <index -1 ; i++) {
                n = n.next;
            }
            Node temp = n.next; // Created the temp variable to store tha deleting data.
            n.next = temp.next;
            temp = null;
        }
    }
}
