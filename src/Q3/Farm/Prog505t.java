package Q3.Farm;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Prog505t {
    public int findLowest(ArrayList<Integer> a) {
        int minIndex = 0;
        int minInt = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < minInt) {
               minIndex = i;
               minInt = a.get(i);
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/Prog505t.dat"));

            ArrayList<Horse> horses = new ArrayList<>();
            ArrayList<Cow> cows = new ArrayList<>();
            int hayBales = file.nextInt();
            double hbCost = file.nextDouble();
            int cornCobs = file.nextInt();
            double ccCost = file.nextDouble();
            int numCows = file.nextInt();

            for (int i = 0; i < numCows; i++) {
                int weight = file.nextInt();
                double pounds = file.nextDouble();
                int indHayBales = file.nextInt();
                int indCornCobs = file.nextInt();
                Cow c = new Cow("Cow", weight, pounds, indCornCobs, indHayBales);
                cows.add(c);
            }

            int numHorses = file.nextInt();
            for (int i = 0; i < numHorses; i++) {
                int weight = file.nextInt();
                int indHayBales = file.nextInt();
                int indCornCobs = file.nextInt();
                int numRides = file.nextInt();
                double rideCost = file.nextDouble();
                Horse h = new Horse("Horse", weight, indCornCobs, indHayBales, numRides, rideCost);
                horses.add(h);
            }

            double iotd = 0;
            for (Horse a : horses) {
                iotd += a.value(ccCost, hbCost);
            }
            for (Cow a : cows) {
                iotd += a.value(ccCost, hbCost);
            }
            System.out.println("IOTD: " + iotd);

            double feedCost = 0;
            for (Horse a : horses) {
                feedCost += a.getFeedCost(ccCost, hbCost);
            }
            for (Cow a : cows) {
                feedCost += a.getFeedCost(ccCost, hbCost);
            }
            System.out.println("Feed Cost: " + feedCost);

            int totalWeight = 0;
            for (Horse a : horses) {
                totalWeight += a.getWeight();
            }
            for (Cow a : cows) {
                totalWeight += a.getWeight();
            }
            System.out.println("Total Weight: " + totalWeight);


            int cornNeeded = 0;
            int hayNeeded  = 0;
            for (Horse a : horses) {
                cornNeeded += a.getNumCorn();
                hayNeeded += a.getNumHayBales();
            }
            for (Cow a : cows) {
                cornNeeded += a.getNumCorn();
                hayNeeded += a.getNumHayBales();
            }
            if (cornCobs < cornNeeded || hayBales < hayNeeded) {
                System.out.println("Not enough hay or corn!");
            } else {
                System.out.println("Animals fed!");
                cornCobs -= cornNeeded;
                hayBales -= hayNeeded;
            }


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
