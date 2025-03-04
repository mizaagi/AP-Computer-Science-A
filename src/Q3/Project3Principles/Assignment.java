package Q3.Project3Principles;

public class Assignment {
    private double score;
    private int weight;
    private String name;

    public Assignment(String n, double s, int w) {
        name = n;
        score = s;
        weight = w;
    }

    public String getName()  { return name;   }
    public int getWeight()   { return weight; }
    public double getScore() { return score;  }
    public String toString() { return name + " | Score: " + (score * 0.01 * weight) + "/" + weight + " (" + score + "%)"; }
}