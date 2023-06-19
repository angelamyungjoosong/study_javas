package vehicles;
//Vehicle 상속받음 
public class Bike implements Vehicle  {
    int speed = 0 ; 
    int increment = 5;

    @Override
    public int speedUP(int val) {
        this.speed =  this.speed + this.increment;
        return this.speed;
    }

    @Override
    public int speedDown(int val) {
         this.speed = this.speed - this.increment;
        return this.speed;
    }
    
}
