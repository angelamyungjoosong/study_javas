import java.util.Scanner;

public class CarsWithDB {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
          
            String workKey = "P";
              while(!workKey.equals("E")){
                 System.out.print("선택입력 :");
                workKey = scanner.nextLine();
              }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}
