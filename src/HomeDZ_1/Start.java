package HomeDZ_1;

public class Start {


    public static void main(String[] args) {

        //*****Задаем объекты со своими ограничениями ***************
        Person person = new Person(5, 5);
        Pussy cat = new Pussy(1, 4);
        Robot robot = new Robot(3, 1);


        //******задаем беговую дорожку и стену***********************
        Obstacle treadmill_run = Obstacle.TREADMILL_run;
        Obstacle wallwall_jump = Obstacle.WALLWALL_jump;

        //*****задаем массивы: интерфейсы бега, прыжков и массив препятствий****
        Runing[] runners = {person, cat, robot};
        Jump[] jumpers = {person, cat, robot};
        Obstacle[] obstacles = {treadmill_run, wallwall_jump};


        /*цикл пробегается по дорожке и по стене
         * если дорожка, то запускается интерфейс бега
         * если стена, то запускается интерфейс прыжков*/
        for (Obstacle obstacleObjects : obstacles) {
            if (obstacleObjects == treadmill_run) {
                runStart(runners, obstacleObjects);

            } else {
                jumpStart(jumpers, obstacleObjects);
            }
        }
    }

    //************************************************************************************************



    public static void runStart(Runing[] runners, Obstacle obstacleObjects) {
        for (Runing runObjects : runners) {
            System.out.println("Длина дорожки: " + obstacleObjects.getSizeObstacle());
            runObjects.runing(runObjects);
            if (runObjects.getMaxRun() >= obstacleObjects.getSizeObstacle()) {
                System.out.println(runObjects.getClass() + " успешно справился с пробежкой!\n");
            } else {
                System.out.println(runObjects.getClass() + " не справился с задачей\n");
            }
        }
    }

    public static void jumpStart(Jump[] jumpers, Obstacle obstacleObjects) {
        for (Jump jumpObjects : jumpers) {
            System.out.println("Высота барьера: " + obstacleObjects.getSizeObstacle());
            jumpObjects.jumping(jumpObjects);
            if (jumpObjects.getMaxJump() >= obstacleObjects.getSizeObstacle()) {
                System.out.println(jumpObjects.getClass() + "успешно перепрыгнул!" + "\n");
            } else {
                System.out.println(jumpObjects.getClass() + " застрял у стены" + "\n");
            }
        }
    }
}