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
            Scanner maya = new Scanner(new File("Langdat/Prog505t.dat"));

            ArrayList<Horse> horses = new ArrayList<>();
            ArrayList<Cow> cows = new ArrayList<>();
            int hayBales =  maya.nextInt();
            double hbCost = maya.nextDouble();
            int cornCobs =  maya.nextInt();
            double ccCost = maya.nextDouble();
            int numCows =   maya.nextInt();

            for (int i = 0; i < numCows; i++) {
                int weight = maya.nextInt();
                double pounds =  maya.nextDouble();
                int indHayBales = maya.nextInt();
                int indCornCobs = maya.nextInt();
                Cow c = new Cow("Cow", weight, pounds, indCornCobs, indHayBales);
                cows.add(c);
            }

            int numHorses = maya.nextInt();
            for (int i = 0; i < numHorses; i++) {
                int weight = maya.nextInt();
                int indHayBales = maya.nextInt();
                int indCornCobs = maya.nextInt();
                int numRides = maya.nextInt();
                double rideCost = maya.nextDouble();
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
            int cowIndex = 0;
            Cow cheapCow = cows.get(0);
            for (int repeat = 0; repeat < 3; repeat++) {
                for (int i = 1; i < cows.size(); i++) {
                    if (cows.get(i).getMilk() < cheapCow.getMilk()) {
                        cowIndex = i;
                        cheapCow = cows.get(i);
                    }
                }
                cows.remove(cowIndex);
            }

            cows.remove(0);
            cows.add(0, new Cow("Cow", 1250, 80, 3, 4));
            System.out.println(cows.size() + " total cows");
            System.out.println(horses.size() + " total horses");




        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
