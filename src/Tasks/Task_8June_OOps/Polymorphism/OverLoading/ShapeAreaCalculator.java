package Tasks.Task_8June_OOps.Polymorphism.OverLoading;

public class ShapeAreaCalculator {
    //square
    int area(int side){
        return side*side;
    }

    //rect
    int area(int length ,int breadth){
        return length*breadth;
    }

    double area(double radius){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        ShapeAreaCalculator shape = new ShapeAreaCalculator();

        int areaOfSquare =shape.area(3);
        System.out.println("Area of Square : "+areaOfSquare);

        int areaOfRect =shape.area(5,6);
        System.out.println("Area of Rectangle : "+areaOfRect);

        double areaOfCircle = shape.area(2.8);
        System.out.println("Area of Circle : "+areaOfCircle);

    }
}
