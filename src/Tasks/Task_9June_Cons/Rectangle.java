package Tasks.Task_9June_Cons;

public class Rectangle {
    int breadth;
    int length;

    public Rectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }

    // Method to calculate area
    public int getArea() {
        return length * breadth;
    }
}
