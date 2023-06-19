package vehicles; // object, abstractvehicle의 모든 method와 변수를 다 가지고 온 상태임 

public class Scooter extends AbstractVehicle {
    @Override
    public int speedUp(int val){
        this.speed = this.speed + this.increment;
        return this.speed;
    }; 
}
