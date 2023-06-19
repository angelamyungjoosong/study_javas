import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.MountainBike;

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
            MountainBike mountainBike = new MountainBike(6200, "yellow", 5);
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
