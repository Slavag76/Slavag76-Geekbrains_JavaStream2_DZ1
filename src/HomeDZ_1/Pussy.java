package HomeDZ_1;

public class Pussy implements Runing, Jump {
    private int maxRun;
    private int maxJump;


    public Pussy(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String toString() {
        return "Pussy{" +
                "maxRun=" + maxRun +
                ", maxJump=" + maxJump +
                '}';
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }
}
