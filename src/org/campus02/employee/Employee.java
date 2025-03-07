package org.campus02.employee;

public class Employee {

    private int empNubmer;
    private String name;
    private double salary;
    private String department;

    public Employee(int empNubmer, String name, double salary, String department) {
        this.empNubmer = empNubmer;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpNubmer() {
        return empNubmer;
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
                "empNubmer=" + empNubmer +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
