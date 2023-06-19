package vehicles;

abstract class AbstractVehicle {
    int speed = 0;
    int increment = 5;
    public int speedUp(int val);  // 구현을 해줘야 동작이 됨.
    public int speedDown(int val) {
        this.speed = this.speed - this.increment;
        return this.speed;
    }
}
