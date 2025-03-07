package org.campus02.lv;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);

        // !! ACHTUNG !!
        // Arrays.sort() hier nicht möglich
        Collections.sort(numbers);
        System.out.println(numbers);


        // STRING funktioniert analog zu Integer

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(2, "Max", "Mustermann"));
        students.add(new Student(Integer.MAX_VALUE, "Susi", "Sorglos"));
        students.add(new Student(-4, "John", "Doe"));

        Collections.sort(students);
        System.out.println(students);

    }
}
