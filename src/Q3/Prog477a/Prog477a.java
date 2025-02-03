package Q3.Prog477a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog477a.dat"));
            int gender;
            int grade;
            ArrayList<Student> students = new ArrayList<Student>();
            int[][] input = new int[5][3];
            // Left here as a temporary "gravestone" of my past stupidity.
//            String[][] output = {   {"A", "", "", "", ""},
//                                    {"B", "", "", "", ""},
//                                    {"C", "", "", "", ""},
//                                    {"D", "", "", "", ""},
//                                    {"F", "", "", "", ""} };


            while (file.hasNext()) {
                gender = file.nextInt();
                grade  = file.nextInt();
                Student stu = new Student(gender, grade);
                students.add(stu);
            }
            for (Student stu : students) {
                if (stu.getGender() == 1) {
                    if (stu.getGrade() == 1) {
                        input[0][0]++;
                        input[0][2]++;
                    }
                    else if (stu.getGrade() == 2) {
                        input[1][0]++;
                        input[1][2]++;
                    }
                    else if (stu.getGrade() == 3) {
                        input[2][0]++;
                        input[2][2]++;
                    }
                    else if (stu.getGrade() == 4) {
                        input[3][0]++;
                        input[3][2]++;
                    }
                    else if (stu.getGrade() == 5) {
                        input[4][0]++;
                        input[4][2]++;
                    }
                }
                if (stu.getGender() == 2) {
                    if (stu.getGrade() == 1) {
                        input[0][1]++;
                        input[0][2]++;
                    }
                    else if (stu.getGrade() == 2) {
                        input[1][1]++;
                        input[1][2]++;
                    }
                    else if (stu.getGrade() == 3) {
                        input[2][1]++;
                        input[2][2]++;
                    }
                    else if (stu.getGrade() == 4) {
                        input[3][1]++;
                        input[3][2]++;
                    }
                    else if (stu.getGrade() == 5) {
                        input[4][1]++;
                        input[4][2]++;
                    }
                }
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(input[i][j] + " ");
                    }
                    System.out.println();
                }

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
