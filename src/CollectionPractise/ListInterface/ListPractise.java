package CollectionPractise.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListPractise {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        //Add Elements

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("dragonFruit");
        fruits.add("KIWI");
        fruits.add("banana");
        fruits.add("KIWI");   //duplicate allowed

        //print all fruits
        System.out.println("All Fruits : "+fruits);

        //Access fruits by index
        System.out.println("the position 1: "+fruits.get(1));

        //update the value at index 3
        System.out.println("original fruit at 3 position :" +fruits.get(3));

        fruits.set(3,"mango");
        System.out.println("Updated fruit at 3 position :" +fruits.get(3));

        //size
        System.out.println("Size of an arrayList : " +fruits.size());

        //check if fruit contains apple
        System.out.println("contains apple? :" +fruits.contains("apple"));

        //loop over fruits

        //remove fruit
        System.out.println(fruits.remove(1));


        for(String elements : fruits){
            System.out.println(elements);
        }

    }
}
