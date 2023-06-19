package animals;

public class AnimalMain {
    public static void main(String[] args) {
    HumanAnimallmpl humanAnimallmpl = new HumanAnimallmpl();
        System.out.println(humanAnimallmpl.toString());

    HorseAnimallmpl horseAnimallmpl = new HorseAnimallmpl();
        System.out.println(horseAnimallmpl.toString());

    HumanAnimalExtend humanAnimalExtend = new HumanAnimalExtend();
        System.out.println(humanAnimalExtend.getSpeed());

    HorseAnimalExtend horseAnimalExtend = new HorseAnimalExtend();
        System.out.println(horseAnimalExtend.getSpeed());

    }
}
