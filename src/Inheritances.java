import java.util.HashMap;
import java.util.Map;

import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.Bike;
import vehicles.Car;
import vehicles.MountainBike;
import vehicles.RoadCycle;
import vehicles.Scooter;
import vehicles.Vehicle;

public class Inheritances {
    public static void main(String[] args) {
        try {
            // Object 확인 
            // ObjectInheritances objectInheritances = new ObjectInheritances();
            
            // 상속할 class 생성
            // Bicycle bicycle = new Bicycle(5500, "blue");
            // System.out.println(bicycle.toString());

            // 상속 활용
            // MountainBike mountainBike = new MountainBike();  // mountainbike가 인스턴스화 될 때 bicycle 을 먼저 끌과 와서 실행됨.
            // MountainBike mountainBike = new MountainBike(6200, "yellow", 5);

            // RoadCycle 실행
            // RoadCycle roadCycle = new RoadCycle("비앙키", 70000, "pink");
            // System.out.println(roadCycle.toString());

            //구현하고 호출하기 
            // Car car = new Car();
            // int speed = car.speedUP(1);
            // car.speedDown(2);

            //클래스 이름 다른 경우: 보통 구현관계(껍데기 = 새롭게 구현한것 ) / 실제 성격은 Bike 
            // Vehicle bike = new Bike();
            // Vehicle car_second = new Car();
            // System.out.println();

            // 변수명 instanceof 클래스명 (bike instanceof Bike)

            // HashMap은 Map을 구현 
            // Map<String,String> hashmap = new HashMap<>();

            //추상화 확인 
            Scooter scooter = new Scooter();
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}



//mountainBike.toString() "price :0, color :null" 특정값 셋팅 가능 
