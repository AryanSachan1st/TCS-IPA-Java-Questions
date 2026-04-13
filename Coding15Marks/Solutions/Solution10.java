package Coding15Marks.Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Student {
    private int id;
    private String name;
    private double[] marks;

    // constructor
    public Student(int id, String name, double[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    // getters
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double[] getMarks() {
        return this.marks;
    }

    // concrete methods
    public double getAverage() {
        double avg = 0.0;

        for (double marks: this.marks) {
            avg += marks;
        }

        avg /= (double) marks.length;
        return avg;
    }

    // abstract methods
    abstract String getGrade();
}

class UGStudent extends Student {
    public UGStudent(int id, String name, double[] marks) {
        super(id, name, marks);
    }

    public String getGrade() {
        double avg = this.getAverage();
        if (avg >= 80) {
            return "A";
        } else if (avg >= 60) {
            return "B";
        }
        return "C";
    }
}

class PGStudent extends Student {
    public PGStudent(int id, String name, double[] marks) {
        super(id, name, marks);
    }

    public String getGrade() {
        double avg = this.getAverage();
        if (avg >= 85) {
            return "Distinction";
        } else if (avg >= 50) {
            return "Pass";
        }
        return "Fail";
    }
}

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entet number of students: ");
        int num = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();
        
        for (int i=0; i<num; i++) {
            System.out.print("Enter student type (UG/PG): ");
            String studentType = sc.nextLine();

            System.out.print("Enter student id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.println("Enter student marks: ");
            double[] marks = new double[5];
            for (int j=0; j<5; j++) {
                marks[j] = sc.nextDouble();
            }
            sc.nextLine();

            UGStudent ugs = null;
            PGStudent pgs = null;

            switch (studentType) {
                case "UG":
                    ugs = new UGStudent(id, name, marks);
                    break;
                case "PG":
                    pgs = new PGStudent(id, name, marks);
                    break;
                default:
                    System.out.println("Enter valid student type: PG or UG");
            }

            if (ugs != null) {
                students.add(ugs);
            } else if (pgs != null) {
                students.add(pgs);
            }
        }

        for (Student student: students) {
            System.out.println(student.getId() + " " + student.getName() + " " + student.getAverage() + " " + student.getGrade());
        }

        sc.close();
    }
}
