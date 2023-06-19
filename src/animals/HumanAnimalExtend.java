package animals;

public class HumanAnimalExtend extends HumanAnimallmpl{
    int speed = 3;
    public HumanAnimalExtend () {
        super.Legs = Legs;
        super.Arms = Arms;
        this.speed = speed;
    }
    public String getSpeed() {
        String str = "speed : " + this.speed + "km";
        return str;
    }
    
}
