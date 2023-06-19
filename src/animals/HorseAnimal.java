package animals;

public class HorseAnimal implements InterfaceAnimal {
int setLegs = 4; 
int setArms = 0;
String setEnableSpeech = "No";

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
       
        return setEnableSpeech ;
    }
    
        public String toString(){
        String str = "legs :" + this.setLegs + ", arms :" + this.setArms + ", speech :" 
        + this.setEnableSpeech;
        return str;
}

        

}
