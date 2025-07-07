package CollectionPractise.SetInterface;

import CollectionPractise.ListInterface.ArrayAsList;

import java.awt.*;
import java.util.*;
import java.util.List;

public class SetPractise {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("kiwi");

        System.out.println(fruits);

        System.out.println(fruits.size());

        removeDuplicateUsingSet();
    }

    //Exercise 1: Remove Duplicates from a List using Set
    public static void removeDuplicateUsingSet(){
        List<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(2,4,1,6,4,7,2,8));

        System.out.println("Before :" +num);

        Set<Integer> unique = new HashSet<>(num);
        System.out.println("After removing duplicates :" +unique);

    }
}
