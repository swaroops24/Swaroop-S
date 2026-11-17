interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to " + width);
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to " + height);
    }

    int area() {
        return width * height;
    }

    void display() {
        System.out.println("Rectangle -> Width: " + width + ", Height: " + height
                + ", Area: " + area());
    }
}

public class ResizableDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);

        System.out.println("---- Original Rectangle ----");
        rect.display();

        System.out.println("\n---- Resizing ----");
        rect.resizeWidth(20);
        rect.resizeHeight(15);