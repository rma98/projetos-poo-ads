package listaduplamenteencadeada;

public class Main {
	public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.performAction("Insert", "Hello, ");
        editor.performAction("Insert", "world!");
        editor.performAction("Delete", "world");
        editor.performAction("Insert", "universe!");

        System.out.println("Texto atual: " + getCurrentContent(editor));

        editor.undo();
        System.out.println("Após desfazer: " + getCurrentContent(editor));

        editor.redo();
        System.out.println("Após refazer: " + getCurrentContent(editor));
    }

    public static String getCurrentContent(TextEditor editor) {
        if (editor.current != null) {
            return editor.current.action.content;
        }
        return "";
    }
}
