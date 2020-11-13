package HomeDZ_1;

public interface Runing {

    default void runing(Runing runObjects) {
        System.out.println(runObjects.toString() + " идет процесс пробежки");
    }

    int getMaxRun();
}


