package animals;


public class ExtendHumanAnimal extends HumanAnimal {
       String Speed;

    public ExtendHumanAnimal(){
        this.Speed = "3km";
        super.setLegs = setLegs;
        super.setArms = setArms;
        super.setEnableSpeech = setEnableSpeech;}





    public String Speed(){
    String str =  "speed :" + this.Speed;
    return str;
    }

}
