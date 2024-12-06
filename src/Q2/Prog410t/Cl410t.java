package Q2.Prog410t;

public class Cl410t {
    private int id;
    private int income;
    private int members;

    public Cl410t(int id, int in, int mem) {
       this.id      = id;
       this.income  = in;
       this.members = mem;
    }

    public int getIncome() {
        return this.income;
    }

    public int getMembers() {
        return members;
    }

    public String toString() {
        return id + "\t\t" + income + "\t" + members;
    }
}