public class Car implements VehicleInterface {

    private int gear = 0;
    private int speed = 0;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedUp(int change) {
        this.speed = this.speed + change;
    }

    @Override
    public void slowDown(int change) {
        this.speed -= change;
    }

    public void display() {
        System.out.println("I am a Car, going " + this.speed +
                "km/h and inplace gear is " + this.gear);
        standard();
    }
}
