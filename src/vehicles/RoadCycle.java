package vehicles;

import java.util.HashMap;

public class RoadCycle extends Bicycle {
    // 퀘스트
    // -제품명, 색상, 가격이 초기화
    // -toString()을 통해 제품명, 색상, 가격 출력
    // -상속은 Bicycle.java
    // -동작 확인은 Inheritances.java

    String product_name ="";
    HashMap<String, Object> spec ;
    public RoadCycle(String product_name, int price, String color) {
        this.product_name = product_name;
        super.color = color;
        super.price = price;
    }
    public String toString() { 
        String str = "product_name : " + this.product_name +  "price : " + super.price +  ", color : " + super.color; 
        return str;
    }
}