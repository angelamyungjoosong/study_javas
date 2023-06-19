package vehicles;

import java.util.HashMap;

public class RoadCycle extends Bicycle {
    // 퀘스트
    // -제품명, 색상, 가격 정보는 인스턴스 시 변수 셋팅
    // -toString()을 통해 제품명, 색상, 가격 출력
    // -상속은 Bicycle.java
    // -동작 확인은 Inheritances.java

    String name;
    public RoadCycle() {

    }
    public RoadCycle(String name, int price, String color) {
        this.name = name;
        super.color = color;
        super.price = price;
    }
    public String toString() { 
        String str = "product_name : " + this.name +  "price : " + super.price +  ", color : " + super.color; 
        return str;
    }
}
