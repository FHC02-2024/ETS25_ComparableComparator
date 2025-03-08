package org.campus02.lv;

import java.util.Comparator;

public class StudentLastFirstNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int res = o1.getLastName().compareTo(o2.getLastName());
        if (res == 0) {
            return o2.getFirstName().compareTo(o1.getFirstName());
        }
        return res;
    }
}
