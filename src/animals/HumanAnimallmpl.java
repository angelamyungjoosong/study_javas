package animals;

public class HumanAnimallmpl implements InterfaceAnimal {
    int Legs = 2;
    int Arms = 2 ;
    String EnableSpeech = "yes";

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
