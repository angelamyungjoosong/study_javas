package vehicles;

public class Car implements Vehicle {
    int speed = 0;   // 내부에서 공통적으로 사용할 변수 선언, 인스턴스화 될 때 이것으로 셋팅됨
    int increment = 20;
    
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
