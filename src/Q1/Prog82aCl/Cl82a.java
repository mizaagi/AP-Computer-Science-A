package Q1.Prog82aCl;

public class Cl82a {
    private int speedLimit;
    private int vehicleSpeed;
    private int ticketCost;

    public Cl82a(int speedLimit, int vehicleSpeed) {
        this.speedLimit = speedLimit;
        this.vehicleSpeed = vehicleSpeed;
    }

    public void calc() {
        ticketCost = 20 + (vehicleSpeed-speedLimit)*5;
    }

    public String toString() {
        return "Fine-----------------" + ticketCost;
    }
}