package Tasks.Task_8June_OOps.Hirarchical;

public class Rectangle extends Shape{
    int height =4 ;
    int width=6;
    int areaOfrect;
    void calculateAreaOfRectangle(){
        super.displayShape();
        areaOfrect = height*width;
        System.out.println("Area of Rectangle is: " + areaOfrect);
    }
    void displayShape(){
        System.out.println("I am rectangle");
    }
}
