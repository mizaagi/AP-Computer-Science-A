package Q3.Farm;

public abstract class Animal {
    private String myName;
    private int myWeight;
    private int myNumCorn;
    private int myNumHayBales;

    public Animal(String name, int weight, int corn, int hay) {
        myName = name;
        myWeight = weight;
        myNumCorn = corn;
        myNumHayBales = hay;
    }

    public abstract double value(double cornCost, double hay);

    public String getName()     { return myName;        }
    public int getWeight()      { return myWeight;      }
    public int getNumHayBales() { return myNumHayBales; }
    public int getNumCorn()     { return myNumCorn;     }

    public double getFeedCost(double cornCost, double hayCost) { return (myNumCorn * cornCost) + (myNumHayBales * hayCost);}

}
