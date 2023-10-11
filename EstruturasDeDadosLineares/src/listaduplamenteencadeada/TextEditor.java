package listaduplamenteencadeada;

public class TextEditor {
	DoublyLinkedNode current;

    public void performAction(String actionType, String content) {
        TextAction newAction = new TextAction(actionType, content);
        DoublyLinkedNode newNode = new DoublyLinkedNode(newAction);

        if (current == null) {
            current = newNode;
        } else {
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }
}
