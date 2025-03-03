package Q3.Prog702q;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog702q.txt"));
            List<Vehicle> vehicles = new ArrayList<Vehicle>();
            while (file.hasNext()) {
                if (file.nextInt() == 1) {
                    String name = file.next();
                    int tires = file.nextInt();
                    double value = file.nextDouble();
                    Car c = new Car(name, tires, value);
                    vehicles.add(c);
                } else if (file.nextInt() == 2) {
                    String name = file.next();
                    int tires = file.nextInt();
                    double mileage = file.nextDouble();
                    Truck t = new Truck(name, tires, mileage);
                    vehicles.add(t);
                } else if (file.nextInt() == 3) {
                    String name = file.next();
                    int tires = file.nextInt();
                    String home = file.next();
                    Bus b = new Bus(name, tires, home);
                }
            }
            
            int totCWorth = 0;
            int cCnt = 0;
            double totTworth = 0;
            String tNameLeastVal = "";
            double tLeastVal = Double.MAX_VALUE;
            String longestHTName = "";
            int longestHTNameCnt = 0;
            int totBworth = 0;
            int totCtires = 0;
            int totTtires = 0;
            int totBtires = 0;
            double totWorth = 0;

            for (Vehicle v : vehicles) {
                if (v instanceof Car) {
                    totCWorth += ((Car)v).getWorth();
                    cCnt++;
                    totCtires += ((Car)v).getTire();
                } else if (v instanceof Truck) {
                    totCWorth += v.getValue();
                    totTtires += ((Truck)v).getTire();
                    double tWorth = ((Truck)v).getValue();
                    if (tWorth < tLeastVal) {
                        tLeastVal = tWorth;
                        tNameLeastVal = ((Truck)v).getName();
                    }
                } else if (v instanceof Bus) {
                    totBtires += ((Bus)v).getTire();
                    if (((Bus)v).getHome().length() > longestHTNameCnt) {
                        longestHTName = ((Bus)v).getHome();
                        longestHTNameCnt = longestHTName.length();
                    }
                    totBworth += 50000;
                }
            } 

            System.out.println("Total Number of Vehicles: " + vehicles.size());
            System.out.println("Total Amount of the Cars' Worth: $" + totCWorth);
            System.out.println("Total Amount of the Vehicles' Worth: $" + totWorth);
            System.out.println("Longest Home Destination Name: " + longestHTName);
            System.out.println("Truck With The Least Value: " + tNameLeastVal + " ($" + tLeastVal + ")");
            System.out.println("Total Number of Car Tires: " + totCtires);
            System.out.println("Total Number of Truck Tires: " + totTtires);
            System.out.println("Total Number of Bus Tires: " + totBtires);


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}