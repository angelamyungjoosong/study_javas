package vehicles;

public class RoadCycle extends Bicycle {
    String name;
    public RoadCycle(){

    }
    public RoadCycle(String name, int price, String color){
        this.name= name;
        super.price = price;
        super.color = color;
    }

    public String toString(){
        String str = "name :"  + this.name + "price :" + super.price + ", color :" + super.color ;
        return str;
    }

}
