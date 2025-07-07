package CollectionPractise.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {

    public static void main(String[] args) {
        List<String> names =new ArrayList<>();
        names.addAll(Arrays.asList("pooja","ram","Lakshman","kavita","sita","kajal"));

        //print names
        System.out.println(names);

        //print name start with k
        System.out.println("names start with k are : ");
        for(String name : names){
            if(name.toLowerCase().startsWith("k")){

                System.out.println(name);
            }
        }

       // System.out.println(names.getLast());
    }
}
