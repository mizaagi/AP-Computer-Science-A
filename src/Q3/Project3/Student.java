package Q3.Project3;

import java.util.ArrayList;

public class Student {
    private ArrayList<Course> courses;
    private double gpa;
    private String name;

    public Student(String n, ArrayList<Course> c) {
        name = n;
        courses = c;

        double preGpa = 0.0;
        double numClasses = 0.0;
        for (Course d : courses) {
            numClasses++;
            preGpa += d.getGrade();
        }
        preGpa /= numClasses;
        preGpa *= 0.1;
        preGpa *= 4.0;
        gpa = preGpa;
    }

    public double getGpa() { return gpa; }
    public void addCourse(Course c) {
        courses.add(c);
    }
    public void calc() {
        double preGpa = 0.0;
        double numClasses = 0.0;
        for (Course d : courses) {
            numClasses++;
            preGpa += d.getGrade();
        }
        preGpa /= numClasses;
        preGpa *= 0.1;
        preGpa *= 4.0;
        gpa = preGpa;
    }
    public String getName() { return name; }
    public String toString() {
        calc();
        String out = "Name: " + name + " | GPA: " + gpa + "\nCourses: ";
        if (courses.size() != 0) {
            for (Course c : courses) {
                out += c;
            }
        } else out += "NONE";
        return out;
    }
    public ArrayList<Course> getCourses() { return courses; }
}