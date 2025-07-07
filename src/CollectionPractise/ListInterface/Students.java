package CollectionPractise.ListInterface;

import java.util.*;

public class Students {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("AKASH","manoj","samadhan","sampda","pooja","sonali","rupali","poonam"));

        //printing the list
        System.out.println("Student names :" +students);

        //removing a student by name
        students.remove("pooja");
        System.out.println("Students after removing pooja :"+students);

        //check if name exists in list

        System.out.println("pooja exists??" +students.contains("pooja"));
        System.out.println(students.size());

        //sort list alphabeticaly
        Collections.sort(students);
        System.out.println("After sorting :"+students);

        //print second last element

        System.out.println("second last from the list : " +students.get(students.size()-2));

    }
}
