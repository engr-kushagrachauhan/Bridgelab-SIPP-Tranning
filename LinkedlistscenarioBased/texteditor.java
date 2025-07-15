package LinkedlistscenarioBased;
import java.util.ArrayDeque;
import java.util.Deque;
public class texteditor {
    private interface EditAction {
        void apply(StringBuilder doc);
        void undo(StringBuilder doc);
    }
    private static class InsertAction implements EditAction {
        private final int pos; private final String text;
        InsertAction(int pos, String text) { this.pos = pos; this.text = text; }
        public void apply(StringBuilder doc) { doc.insert(pos, text); }
        public void undo(StringBuilder doc) { doc.delete(pos, pos + text.length()); }
        @Override public String toString() { return "Insert(\"" + text + "\")"; }
    }
    static class TextEditor {
        private final StringBuilder document = new StringBuilder();
        private final Deque<EditAction> undo = new ArrayDeque<>();
        private final Deque<EditAction> redo = new ArrayDeque<>();
        public void type(String text) {
            EditAction a = new InsertAction(document.length(), text);
            a.apply(document);
            undo.push(a); redo.clear();
        }
        public void undo() {
            if (undo.isEmpty()) return;
            EditAction a = undo.pop();
            a.undo(document);
            redo.push(a);
        }
        public void redo() {
            if (redo.isEmpty()) return;
            EditAction a = redo.pop();
            a.apply(document);
            undo.push(a);
        }
        public String read() { return document.toString(); }
    }
    public static void main(String[] args) {
        TextEditor ed = new TextEditor();
        ed.type("Hello");
        ed.type(" world");
        System.out.println(ed.read());       

        ed.undo();
        System.out.println(ed.read());       
        ed.redo();
        System.out.println(ed.read());              
    }
}
