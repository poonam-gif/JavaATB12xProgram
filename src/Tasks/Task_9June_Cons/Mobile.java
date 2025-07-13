package Tasks.Task_9June_Cons;

public class Mobile {
    private String brand;
    private int price;

    public Mobile(String brand) {
        this.brand = brand;
    }

    public Mobile(String brand,int price){
        this.brand=brand;
        this.price=price;
    }

    public void getDetails(){
        System.out.println("brand is : "+brand);
        System.out.println("price is :"+price);
    }


}
