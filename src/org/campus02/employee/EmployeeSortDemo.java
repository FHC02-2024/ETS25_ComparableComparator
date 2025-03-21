package org.campus02.employee;

import java.util.Arrays;

public class EmployeeSortDemo {

    public static void main(String[] args) {

        // Testdaten
        Employee[] employees = {
                new Employee(5, "max", 3_000, "Development"),
                new Employee(2, "susi", 6_000, "Research"),
                new Employee(3, "mary", 5_000, "Research"),
                new Employee(6, "john", 4_500, "Sales"),
                new Employee(1, "max", 2_500, "Marketing")
        };
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new NameAscComparator());
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new SalaryDescComparator());
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new DepartmentAscNameDescComparator());
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new SalaryAscNameAscComparator());
        System.out.println(Arrays.toString(employees));
    }
}
