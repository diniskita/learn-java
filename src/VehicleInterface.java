public interface VehicleInterface {

    final int gears = 1;

    void changeGear(int var);

    void speedUp(int var);

    void slowDown(int var);

    default void standard() {
        System.out.println("Default Method");
    }

    static int math(int var) {
        return var + 10;
    }
}
