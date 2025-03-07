package org.campus02.employee;

public class Employee implements Comparable<Employee> {

    private int empNumber;
    private String name;
    private double salary;
    private String department;

    public Employee(int empNubmer, String name, double salary, String department) {
        this.empNumber = empNubmer;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empNubmer=" + empNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        if (this.empNumber < o.empNumber) {
//            return -1;
//        }
//        if (this.empNumber > o.empNumber) {
//            return 1;
//        }
//        return 0;

        // descending nach empNumber
        return Integer.compare(o.empNumber, this.empNumber);
    }
}
