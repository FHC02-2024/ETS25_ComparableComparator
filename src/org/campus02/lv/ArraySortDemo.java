package org.campus02.lv;

import java.util.Arrays;

public class ArraySortDemo {

    public static void main(String[] args){

        int[] numbers = {4, 7, 3, 8, 9, 13, 1};
        for (int i : numbers) {
            System.out.println(i);
        }
        System.out.println(numbers[0]); // erwarte mir 4
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]); // erwarte mir 1

        char[] chars = {'c', 'a', 'b'};
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        String[] strings = {"hallo", "wie", "geht", "es", "dir"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        Student[] students = {
                new Student(2, "Max", "Mustermann"),
                new Student(Integer.MAX_VALUE, "Susi", "Sorglos"),
                new Student(-4, "John", "Doe"),
        };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
