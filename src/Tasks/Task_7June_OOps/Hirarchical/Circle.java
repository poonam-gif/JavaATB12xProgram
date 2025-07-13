package Tasks.Task_7June_OOps.Hirarchical;

public class Circle extends Shape{
    private int r ;
    private double pi ;
   private double areaOfCircle;


    public Circle(int r,double pi) {
        this.r = r;
        this.pi =pi;
    }

    void calculateAreaOfCircle(){
        super.displayShape();
        areaOfCircle = pi * (r*r);
        System.out.println("Area of Circle is :" +areaOfCircle);
    }

}
