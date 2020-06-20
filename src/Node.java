/**
 * This is a Node class because in linked List every element is treated as Node.
 * As we know Node has a Two thing data and address(Pointer Concept) of next element.
 * In java, there is no concept of pointer so we called Node has a reference(Java) of next element.
 */


public class Node {
    public int data;
    public Node next;

    /**
     * This is a constructor of Node class.
     * @param data is created because in Node there is a Data.
     */

    public Node(int data) {
        this.data = data;
    }
}
