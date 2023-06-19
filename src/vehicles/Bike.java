package vehicles;

public class Bike implements Vehicle {
    int speed = 0;   // 내부에서 공통적으로 사용할 변수 선언
    int increment = 5;
    @Override
    public int speedUp(int val) {
       this.speed = this.speed + increment;
       return speed;
    }

    @Override
    public int speedDown(int val) {
       this.speed = this.speed - increment;
        return speed;
    }
    
}
