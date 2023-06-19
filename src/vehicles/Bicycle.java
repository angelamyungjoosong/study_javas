package vehicles;

import java.util.HashMap;

public class Bicycle {
    int price ;
    String color ; 
    HashMap<String, Object> spec ;
   public Bicycle(){
        System.out.println("Bicycle - param empty");
    }
    public Bicycle (int price, String color){
        this.price = price;// this price는 클래스 내의 변수 사용. 클래스내의 메소드도 가져올 수 있다. 
        this.color = color; 
    //this는 위에 있는 메소드에 있는 변수 가져온거 
    } //생성자 - 자기 자신을 메모리에 올릴 떄 인스턴스화 시키는 애. 자기자체 클래스를..
    // 클래스 내부에서 사용할 변수에 값 셋팅 해서 바로 사용가능하게 함 
    // ()가 있으면 call하는거 
    
    public String toString(){
        String str = "price :" + this.price + ", color :" + this.color;
        return str;
        //this.price는 변수와 클래스 이름이 들어가있어서 내부의 있는 변수 끌고옴. 
    }
}
//mountainbike가 인스턴스 될때 상속받은 bicycle을 먼저 실행시킴. object 먼저 실행되고 나서. 
// object -> bicycle -> mountain (여기는 empty여도 자체내에 object와 bicycle 안고 있다)
