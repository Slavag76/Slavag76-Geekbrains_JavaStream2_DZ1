package HomeDZ_1;

public interface Jump {
    default void jumping(Jump jumpObjects) {
        System.out.println(jumpObjects + " идет перепрыгивание");
    }

    int getMaxJump();

}
