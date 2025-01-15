package Q2.Prog215i;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog215i.dat"));
            ArrayList<Cl215i> vehicles = new ArrayList<Cl215i>();
            boolean x = true;
            while (file.hasNext()) {
                int v = file.nextInt();
                if (v == 0) break;
                double mi = file.nextDouble();
                if (mi == 0) x = false;
                double g = file.nextDouble();
                Cl215i vehicle = new Cl215i(v,mi,g);
                vehicle.calc();
                if (x)
                    vehicles.add(vehicle);
                x = true;
            }
            System.out.println("Vehicle\tMiles\tGallons\tMPG");
            for (Cl215i v : vehicles) {
                System.out.println(v.getVehicle() + "\t" + v.getMiles() + "\t" + v.getGallons() + "\t" + v.getMpg());
            }
            System.out.println();
            System.out.println("MPG Statistics: ");
            int best = vehicles.get(0).getVehicle();
            double greatestMpg = vehicles.get(0).getMpg();
            int worst = vehicles.get(0).getVehicle();
            double leastMpg = vehicles.get(0).getMpg();
            double avg = 0;
            for (Cl215i v : vehicles) {
                avg += v.getMpg();
                if (v.getMpg() > greatestMpg) {
                    greatestMpg = v.getMpg();
                    best = v.getVehicle();
                }
                if (v.getMpg() < leastMpg) {
                    leastMpg = v.getMpg();
                    worst = v.getVehicle();
                }
            }
            avg /= vehicles.size();
            System.out.println("Best:\t\t\t" + best);
            System.out.println("Worst:\t\t\t" + worst);
            System.out.println("Fleet Average:\t" + avg);
            System.out.println("Number of Vehicles:\t" + vehicles.size());
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}