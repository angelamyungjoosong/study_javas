package animals;

public class HumanAnimal implements InterfaceAnimal {
    int setLegs = 2;
    int setArms = 2; 
    String setEnableSpeech =  "Yes";

    @Override
    public int setLegs(int val) {
        
        return setLegs;
        
    }

    @Override
    public int setArms(int val) {
       
       return setArms;
    }

    @Override
    public String setEnableSpeech(int val) {
   
        return setEnableSpeech;
    }
    

    public String toString(){
        String str = "legs :" + this.setLegs + ", arms :" + this.setArms + ", speech :" 
        + this.setEnableSpeech;
        return str;
}
}
