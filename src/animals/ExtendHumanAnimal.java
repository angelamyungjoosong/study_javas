package animals;


public class ExtendHumanAnimal extends HumanAnimal {
       String Speed;

    public ExtendHumanAnimal(){
        this.Speed = "3km";
        super.setLegs = setLegs;
        super.setArms = setArms;
        super.setEnableSpeech = setEnableSpeech;}





    public String toString(){
    String str = "legs :" + this.setLegs + ", arms :" + this.setArms + ", speech :" 
    + this.setEnableSpeech + ", speed :" + this.Speed;
    return str;
    }

}
