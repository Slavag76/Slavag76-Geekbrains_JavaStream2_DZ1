package HomeDZ_1;

public enum Obstacle {
    TREADMILL_run(3), WALLWALL_jump(2);

    int sizeObstacle;

    Obstacle(int sizeObstacle) {
        this.sizeObstacle = sizeObstacle;
    }

    public int getSizeObstacle() {
        return sizeObstacle;
    }
}
