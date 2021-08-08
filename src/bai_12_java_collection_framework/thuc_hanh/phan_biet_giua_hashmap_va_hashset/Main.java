package bai_12_java_collection_framework.thuc_hanh.phan_biet_giua_hashmap_va_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "DN");
        Student student2 = new Student("Hung", 21, "QB");
        Student student3 = new Student("Ha", 22, "QN");
        Student student4 = new Student("Nga", 24, "NA");
        Student student5 = new Student("Binh", 23, "DL");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student4);
        studentMap.put(5, student5);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println("...........Set");
        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);
        studentSet.add(student1);

        for(Student student : studentSet){
            System.out.println(student.toString());
        }
    }
}
