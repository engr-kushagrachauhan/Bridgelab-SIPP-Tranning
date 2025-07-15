package LinkedlistscenarioBased;
import java.util.NoSuchElementException;
public class browserHistory {

    private static class Node {
        String url;
        Node prev, next;

        Node(String url) { this.url = url; }
    }

    private static class BrowserHistory {
        private Node current;

        public BrowserHistory(String homepage) {
            current = new Node(homepage);
        }

        public void visit(String url) {
            Node newNode = new Node(url);
            current.next = null;          
            newNode.prev = current;
            current = newNode;
        }

        public String back() {
            if (current.prev == null) throw new NoSuchElementException("No previous page");
            current = current.prev;
            return current.url;
        }

        public String forward() {
            if (current.next == null) throw new NoSuchElementException("No forward page");
            current = current.next;
            return current.url;
        }

        public String getCurrent() { return current.url; }
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory("home.com");
        bh.visit("a.com");
        bh.visit("b.com");
        System.out.println("Current: " + bh.getCurrent());   
        System.out.println("Back → " + bh.back());           
        bh.visit("c.com");
        try { bh.forward(); } catch (NoSuchElementException e) {
            System.out.println("Forward history cleared!");  
        }
    }
}
