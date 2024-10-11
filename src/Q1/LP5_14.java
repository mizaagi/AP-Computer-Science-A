package Q1;

public class LP5_14 {
    public static void main(String[] args) {
        int dice1 = 0;
        int dice2 = 0;
        int tot = 0;
        System.out.println("Dice 1\tDice 2\tTotal");
        for (int lcv = 0; lcv < 5; lcv++) {
            dice1 = ((int)(Math.random() * 6) + 1);
            dice2 = ((int)(Math.random() * 6) + 1);
            tot = dice1 + dice2;
            System.out.println(dice1 + "\t" + dice2 + "\t" + tot);
        }

    }
}
