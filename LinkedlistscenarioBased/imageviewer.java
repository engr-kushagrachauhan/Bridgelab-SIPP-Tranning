package LinkedlistscenarioBased;
import java.util.LinkedList;

public class imageviewer {

    static class ImageViewer {
        private final LinkedList<String> images = new LinkedList<>();
        private int idx = -1;

        public void addImage(String img) {
            images.add(img);
            if (idx == -1) idx = 0;        
        }

        public String nextImage() {
            if (idx < images.size() - 1) idx++;
            return current();
        }

        public String previousImage() {
            if (idx > 0) idx--;
            return current();
        }

        public String current() {
            if (idx == -1) return "(no images)";
            return images.get(idx);
        }
    }

    public static void main(String[] args) {
        ImageViewer viewer = new ImageViewer();
        viewer.addImage("img_001.jpg");
        viewer.addImage("img_002.jpg");
        viewer.addImage("img_003.jpg");

        System.out.println("Start: " + viewer.current());       
        System.out.println("Next : " + viewer.nextImage());     
        System.out.println("Prev : " + viewer.previousImage()); 
    }
}
