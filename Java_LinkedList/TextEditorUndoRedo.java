package Java_LinkedList;
class TextState {
    String content;
    TextState prev, next;

    TextState(String content) {
        this.content = content;
    }
}

public class TextEditorUndoRedo {
    TextState current;

    public void showCurrent() {
        System.out.println("Current State: " + (current != null ? current.content : "Empty"));
    }

    public static void main(String[] args) {
        TextEditorUndoRedo editor = new TextEditorUndoRedo();
        editor.current = new TextState("Hello");
        editor.current.next = new TextState("Hello World");
        editor.current.next.prev = editor.current;
        editor.current = editor.current.next;
        editor.showCurrent();
    }
}