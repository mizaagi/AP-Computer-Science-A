public class ThisIsDumb {
    private String[][] life;

    public ThisIsDumb(String[][] l) {
        life = l;
        
    }

    public void newGen() {
        String[][] nextGen = new String[30][30];
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                nextGen[i][j] = ".";
            }
        }
        for (int i = 1; i < 29; i++) {
            for (int j = 1; j < 29; j++) {
                int n = getNeighbors(i, j);
                if (life[i][j].equals("*")) {
                    if (n == 2 || n == 3)
                        nextGen[i][j] = "*";
                    else
                        nextGen[i][j] = ".";
                } 
                else {
                    if (n == 3)
                        nextGen[i][j] = "*";
                    else
                        nextGen[i][j] = ".";
                }

            }
        }
        life = nextGen;
    }

    public int getNeighbors(int i, int j) {
        int neighbors = 0;
        for (int m = -1; m <= 1; m++)
            for (int n = -1; n <= 1; n++)
                if (life[i+m][j+n].equals("*") && !(m == 0 && n == 0))
                    neighbors++;
        return neighbors;
    }

    public String[][] getLife() {
        return life;
    }
}