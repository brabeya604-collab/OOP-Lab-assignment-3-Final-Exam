// Program 5: Resizable interface with Rectangle

interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + width);
    }

    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + height);
    }

    public void displaySize() {
        System.out.println("Rectangle Size -> Width: " + width + ", Height: " + height);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        r.displaySize();

        r.resizeWidth(30);
        r.resizeHeight(40);
        r.displaySize();
    }
}
