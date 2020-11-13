package HomeDZ_1;

public class Robot implements Runing, Jump {

    public int maxRun;
    public int maxJump;


    public Robot(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String toString() {
        return "Robot{" +
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
