package cases;

import java.util.Scanner;

public class CashierFor {
    public static void main(String[] args) {
        try {
            
            int bucket []= {0,0,0,0,0};
            System.out.println("--- 계산 시작 ---");

            Scanner myObj = new Scanner(System.in);
            for (int first=0; bucket[first] < 5 ; first=first+1){System.out.print((first+1)+"번째 가격 : ");
            bucket[first]= myObj.nextInt();
             if (bucket[first]>100){ bucket[first]=0;}
             else if (bucket[first]==0){break;} }
             System.out.println();
            System.out.println("--- 담은 총합 ---");
            System.out.println("합계:" + (bucket[0]+bucket[1]+bucket[2]+bucket[3]+bucket[4]));
            System.out.println();2
            System.out.println("--- 계산 종료 ---");
            
        } catch(

    Exception e)
    {
        // TODO: handle exception
    }finally
    {

    }

    System.out.println();
}}


// int bucket []= {0,0,0,0,0};
// System.out.println("--- 계산 시작 ---");

// Scanner myObj = new Scanner(System.in);
// for (int first=0; bucket[first] < 5 ; first=first+1){
//  if (bucket[first]<= 100){System.out.print((first+1)+"번째 가격 : ");
//  bucket[first]= myObj.nextInt();}
//  else if (bucket[first]>100){ System.out.print((first+1)+"번째 가격 : "); 
//  bucket[first]= myObj.nextInt();bucket[first]=0;}
//  else if (bucket[first]==0){System.out.print((first+1)+"번째 가격 : ");
// bucket[first]= myObj.nextInt();break;} }

// System.out.println("--- 담은 총합 ---");
// System.out.print("합계:" + (bucket[0]+bucket[1]+bucket[2]+bucket[3]+bucket[4]));
// System.out.println("--- 계산 종료 ---");
