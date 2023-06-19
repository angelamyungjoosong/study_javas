import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.MountainBike;
import vehicles.RoadCycle;

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
            RoadCycle roadCycle = new RoadCycle("비앙키", 70000, "pink");
            System.out.println(roadCycle.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
