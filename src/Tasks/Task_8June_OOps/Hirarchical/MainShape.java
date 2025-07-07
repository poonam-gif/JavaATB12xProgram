package Tasks.Task_8June_OOps.Hirarchical;

public class MainShape {
    public static void main(String[] args) {
        Circle c= new Circle(5,3.14);
       // c.displayShape();
        c.calculateAreaOfCircle();

        Rectangle r = new Rectangle();
        r.calculateAreaOfRectangle();
        r.displayShape();
    }
}
