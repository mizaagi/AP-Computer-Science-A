package Q3;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import Employee;


public class Prog295c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/merge1.dat"));
            ArrayList<Employee> emps = new ArrayList<Employee>();
            ArrayList<Employee> altEmps = new ArrayList<Employee>();

            while (file.hasNext()) {
                String s = file.next();
                String everything = file.next();
                String c = everything.charAt(0);
                String t = everything.charAt(1);
                String d = everything.charAt(2);
                Employee e = new Employee(s,c,t,d);
                emps.add(e);
            }

            Scanner file2 = new Scanner(new File("Langdat/merge2.dat"));
            while (file.hasNext()) {
                String s = file.next();
                String everything = file.next();
                String c = everything.charAt(0);
                String t = everything.charAt(1);
                String d = everything.charAt(2);
                Employee e = new Employee(s,c,t,d);
                altEmps.add(e);
            }
            
            for (Employee e : altEmps)
                for (int i = 0; i < emps.length(); i++)
                    if (e.getSsnSum() < emps.get(i).getSsnSum())
                        emps.add(e, i);


            System.out.println("social sec#  Class  Type  Dept");
            for (Employee e : emps) {
                System.out.println(e);
            }
                
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}