package animals;

public class ExtendHorseAnimal extends HorseAnimal{
        String Speed;

    public ExtendHorseAnimal(){
        this.Speed = "12km";
        super.setLegs = setLegs;
        super.setArms = setArms;
        super.setEnableSpeech = setEnableSpeech;}

  

   


    public String toString(){
    String str = "legs :" + this.setLegs + ", arms :" + this.setArms + ", speech :" 
    + this.setEnableSpeech + ", speed :" + this.Speed;
    return str;
    }

}





   

