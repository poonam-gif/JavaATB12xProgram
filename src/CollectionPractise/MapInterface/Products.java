package CollectionPractise.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class Products {
    public static void main(String[] args) {
        Map<String,Integer> products = new HashMap<>();

        products.put("Sugar",200);
        products.put("Milk",50);
        products.put("Rice",1000);
        products.put("ToothPaste",50);
        products.put("candles",40);
        products.put("toy",8000);
        products.put("sweets",250);

//print all in key value [pair
        for(Map.Entry<String,Integer> myentry : products.entrySet()){
           // System.out.println("Product : " +myentry.getKey()+ ", Price: " +myentry.getValue());

            if(myentry.getValue() > 500){
                System.out.println( myentry.getKey());
            }
        }

        //pritn total no of products
        System.out.println("Total products :" +products.size());

        //

    }
}
