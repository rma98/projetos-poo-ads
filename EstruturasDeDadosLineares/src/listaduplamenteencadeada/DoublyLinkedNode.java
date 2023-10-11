package listaduplamenteencadeada;

public class DoublyLinkedNode {
	TextAction action;
    DoublyLinkedNode prev;
    DoublyLinkedNode next;

    public DoublyLinkedNode(TextAction action) {
        this.action = action;
    }
}
