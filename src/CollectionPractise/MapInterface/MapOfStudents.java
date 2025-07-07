package CollectionPractise.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapOfStudents {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(101,"sagar");
        students.put(102,"nivas");
        students.put(103,"Anil");
        students.put(104,"Kartik");

        System.out.println(students);

        for(Map.Entry<Integer,String> entry : students.entrySet()){
            System.out.println("Key :" +entry.getKey()+ " Value :" +entry.getValue());
        }
    }
}
