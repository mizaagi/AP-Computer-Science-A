package Q3.Project3;

import java.util.ArrayList;


public class Course {
    private ArrayList<Assignment> assignments;
    private double grade;
    private int tPoints;
    private String name;

    public Course(String n) {
        name = n;
        assignments = new ArrayList<Assignment>();
        tPoints = 0;
        grade = 0.0;
    }

    public double getGrade()      { return grade;   }
    public int getTotalPoints()   { return tPoints; }
    public String getCourseName() { return name;    }
    public Assignment getAssignment(String n) {
        for (Assignment a : assignments) {
            if (a.getName().equals(n)) return a;
        }
        return new Assignment("NOT AN ASSIGNMENT", 0, 0);
    }
    public void deleteAssignment(String name) {
        for (int i = 0; i < assignments.size(); i++) {
            if (assignments.get(i).getName().equals(name)) {
                assignments.remove(i);
            }
        }
    }
    public void calcGrade() {
        grade = 0.0;
        tPoints = 0;
        for (Assignment e : assignments) {
            tPoints += e.getWeight();
            grade += e.getScore() * 0.1 * e.getWeight();
        }
        grade /= tPoints;
    }
    public void addAssignment(String n, double s, int w) {
        Assignment e = new Assignment(n,s,w);
        assignments.add(e);
        calcGrade();
    }

    public String toString() {

        String out = name + "\nAssignments:\n";
        if (assignments.size() != 0)
            for (Assignment a : assignments)
                out += "\t- " + a + "\n";
        else
            out += "\tNONE";
        return out;
    }
    public void setName(String na) {
        name = na;
    }
    


}