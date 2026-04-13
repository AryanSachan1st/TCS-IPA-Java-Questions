package Coding15Marks.Solutions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

interface Taxable {
    public double calculateTax();
}

class Employee implements Taxable {
    private int id;
    private String name, dept;
    private double baseSal;

    // constructor
    public Employee(int id, String name, String dept, double baseSal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.baseSal = baseSal;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setBaseSal(double baseSal) {
        this.baseSal = baseSal;
    }

    // getters
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getDept() {
        return this.dept;
    }
    public double getBaseSal() {
        return this.baseSal;
    }

    // interface methods
    public double calculateTax() {
        double tax = 0.0;

        if (baseSal >= 20_000 && baseSal <= 50_000) {
            tax = this.baseSal * 0.1;
        } else if (baseSal > 50_000) {
            tax = this.baseSal * 0.2;
        }

        return tax;
    }

    // concrete methods
    public double getNetSalary() {
        return this.baseSal - this.calculateTax();
    }
}

public class Solution11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> employees = new ArrayList<>();

        for (int i=0; i<n; i++) {
            System.out.print("Enter empId: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter empName: ");
            String name = sc.nextLine();

            System.out.print("Enter department: ");
            String dept = sc.nextLine();

            System.out.print("Enter base salary: ");
            double baseSal = sc.nextDouble();
            sc.nextLine();

            Employee emp = new Employee(id, name, dept, baseSal);
            employees.add(emp);
        }

        System.out.print("Enter threshold: ");
        double thresholdSalary = sc.nextDouble();
        TreeMap<Double, Employee> map = new TreeMap<>(Comparator.reverseOrder());

        for (Employee emp: employees) {
            if (emp.getNetSalary() >= thresholdSalary) {
                map.put(emp.getNetSalary(), emp);
            }
        }

        for (Map.Entry<Double, Employee> entry: map.entrySet()) {
            System.out.println(entry.getValue().getId() + " " + entry.getValue().getName() + " " + entry.getKey());
        }

        sc.close();
    }
}
