package vehicles;

public class Car implements Vehicle {
    int speed = 0 ; //인스턴스화될때 이걸로 셋팅됨  // 형식 맞춰서 구현 
    int increment = 20;

   
    

    @Override
    public int speedDown(int val) {
        this.speed = this.speed - this.increment;
        return this.speed;
    }


    @Override
    public int speedUP(int val) {
        this.speed =  this.speed + this.increment;
        return this.speed;
    }
    
}
