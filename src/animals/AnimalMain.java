package animals;



public class AnimalMain {
    public static void main(String[] args) {
        try {
            InterfaceAnimal humananimal = new HumanAnimal();
            System.out.println(humananimal.toString());

            InterfaceAnimal horseanimal = new HorseAnimal();
            System.out.println(horseanimal.toString());

            ExtendHumanAnimal extendhumananimal = new ExtendHumanAnimal();
            System.out.println(extendhumananimal.Speed());

            ExtendHorseAnimal extendhorseanimal = new ExtendHorseAnimal();
            System.out.println(extendhorseanimal.Speed());


            

        } catch (Exception e) {
              System.out.println(e.getMessage());
        }
    
    
}
}
