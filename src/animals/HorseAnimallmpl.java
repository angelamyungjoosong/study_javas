package animals;

public class HorseAnimallmpl implements InterfaceAnimal {
    int Legs = 4;
    int Arms = 0;
    String EnableSpeech = "No";

    @Override
    public int Legs(int val) {
        return Legs;
    }

    @Override
    public int Arms(int val) {
        return Arms;
    }

    @Override
    public String EnableSpeech(int val) {
        return EnableSpeech;
    }

    public String toString() { 
        String str = "legs : " + this.Legs +  ", arms : " + this.Arms + ", speech : " + this.EnableSpeech; 
        return str;
    }
    
}
