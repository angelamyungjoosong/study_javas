package animals;

public class HorseAnimalExtend extends HorseAnimallmpl {
    int speed = 12;
    public HorseAnimalExtend () {
        super.Legs = Legs;
        super.Arms = Arms;
        this.speed = speed;
    }
    public String getSpeed() {
        String str = "speed : " + speed + "km";
        return str;
    }
    
}
