package vehicles;

abstract class AbstractVehicle { //abstract는 interface와 extend를 동시에 쓸 수 있다 
    int speed = 0;
    int increment = 5;
    public int speedUp(int val); //구현 불완료 -> 실현이 안됨 
    public int speedDown(int val){
        this.speed = this.speed - this.increment;
        return this.speed; //구현 완료 
    }
}
