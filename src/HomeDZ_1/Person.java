package HomeDZ_1;

public class Person implements Runing, Jump {
    private int maxRun;
    public int maxJump;


    public Person(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String toString() {
        return "Person{" +
                "maxRun=" + maxRun +
                ", maxJump=" + maxJump +
                '}';
    }

    public int getMaxJump() {
        return maxJump;
    }

    public int getMaxRun() { return maxRun;   }
}
