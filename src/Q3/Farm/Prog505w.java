package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Prog505w {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog505w.dat"));
            List<Animal> animals = new ArrayList<>();

            int hay = file.nextInt();
            double hayCost = file.nextDouble();
            int corn = file.nextInt();
            double cornCost = file.nextDouble();

            int cowRows = file.nextInt();
            int cowPens = file.nextInt();
            for (int r = 0; r < cowRows; r++) {
                for (int p = 0; p < cowPens; p++) {
                    String name   = file.next();
                    int weight    = file.nextInt();
                    int milk      = file.nextInt();
                    int hayEaten  = file.nextInt();
                    int cornEaten = file.nextInt();
                    Cow wow = new Cow(name, weight, milk, cornEaten, hayEaten);
                    animals.add(wow);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            int horseRows = file.nextInt();
            int horsePens = file.nextInt();
            for (int r = 0; r < horseRows; r++) {
                for (int p = 0; p < horsePens; p++) {
                    String name     = file.next();
                    int weight      = file.nextInt();
                    int hayEaten    = file.nextInt();
                    int cornEaten   = file.nextInt();
                    int rides       = file.nextInt();
                    double rideCost = file.nextDouble();
                    Horse fred = new Horse(name, weight, cornEaten, hayEaten, rides, rideCost);
                    animals.add(fred);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            double iotd = 0;
            for (Animal a : animals) {
                if (a instanceof Cow) {
                    iotd += ((Cow)a).value(cornCost, hayCost);
                } else if (a instanceof Horse) {
                    iotd += ((Horse)a).value(cornCost, hayCost);
                }
            }
            System.out.println("Income of the day: " + iotd);

            double cuWeight = 0;
            for (Animal a : animals) {
                if (a instanceof Cow) {
                    cuWeight += ((Cow)a).getWeight();
                } else if (a instanceof Horse) {
                    cuWeight += ((Horse)a).getWeight();
                }
            }
            System.out.println("Cumulative weight of all animals: " + cuWeight);

            double neededFood = 0;
            double actualFood = hay + corn;
            for (Animal a : animals) {
                if (a instanceof Cow) {
                    neededFood += ((Cow)a).getNumCorn();
                    neededFood += ((Cow)a).getNumHayBales();
                } else if (a instanceof Horse) {
                    neededFood += ((Horse)a).getNumCorn();
                    neededFood += ((Horse)a).getNumHayBales();
                }
            }
            if (neededFood > actualFood) {
                System.out.println("Not enough food!");
            } else {
                System.out.println("Enough food!");
            }


            int maxCowIndex = 0;
            double maxCowValue = Double.MIN_VALUE;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse) animals.get(lcv);
                    double horseValue = horse.value(cornCost, hayCost);
                    if (horseValue > maxCowValue) {
                        maxCowIndex = lcv;
                        maxCowValue = horseValue;
                    }
                }
            }
            System.out.printf("Cow %s makes the most money\n", animals.get(maxCowIndex).getName());

            int minHorseIndex = 0;
            double minHorseValue = Double.MAX_VALUE;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse) animals.get(lcv);
                    double horseValue = horse.value(cornCost, hayCost);
                    if (horseValue < minHorseValue) {
                        minHorseIndex = lcv;
                        minHorseValue = horseValue;
                    }
                }
            }
            System.out.printf("Horse %s makes the least money\n", animals.get(minHorseIndex).getName());

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
