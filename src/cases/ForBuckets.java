package cases;
import java.util.Scanner;

public class ForBuckets {
    public static void main(String[] args) {
        
        try {
            //장바구니 3가지만 담게 선언 
            String bucket_1="";
            String bucket_2="";
            String bucket_3="";
            
            String[] bucket = {"","",""};

            Scanner myObj = new Scanner(System.in);//create a scanner object
            //담는 모양이 세개 다 같다 (변수와 프린트 내용 제외 -> 변수 묶기, 즉 array로+for문으로, (0,1,2)변수/ (변수+1)번째/ 데이터 시작점으로 맞춰줘 보이는거보다 
            for (int first=0; first < bucket.length ; first=first+1){
                System.out.print((first+1)+"번째 담기:");
                bucket[first]= myObj.nextLine();
            }
            
            // System.out.print("1 번째 담기:");
            // bucket_1= myObj.nextLine();//read user input
            // System.out.print("2 번째 담기:");
            // bucket_2= myObj.nextLine();
            // System.out.print("3 번째 담기:");
            // bucket_3= myObj.nextLine();

           System.out.println("--- 담은 내용물 ---");
           System.out.print(bucket[0]+",");
           System.out.print(bucket[1]+",");
           System.out.print(bucket[2]+",");

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
        System.out.println();
    }
    
}
