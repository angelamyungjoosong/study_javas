import java.util.Scanner;


public class PollsWithoutMethod {
    public static void main(String[] args) {
        System.out.println(">이름을 입력하세요");

      

         Scanner myObj = new Scanner(System.in);
         String scan1;
         scan1 = myObj.nextLine();
         

         System.out.println("이름)"+scan1);

        String[][] polls = {
            { "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?"},
            { "(1)전혀 아니다.","(2)아니다.", "(3)그렇다.", "(4)매우그렇다."}
         };

         for (int second = 0; second < polls.length; second = second + 1) 
         {
             for (int third = 0; third < polls[second].length; third = third + 1) 
             {
                 System.out.print(polls[second][third]+"");
             }
             System.out.println();
         }
         System.out.println();

        
         String answer1;
         answer1 = myObj.nextLine();
         System.out.println("답)"+answer1);

         String[][] pollss = {
             {"2. 강의의 내용은 체계적이고 성의있게 구성되었는가?"},
             { "(1)전혀 아니다.","(2)아니다.", "(3)그렇다.", "(4)매우그렇다."}
          };

          for (int fourth = 0; fourth < pollss.length; fourth = fourth + 1) 
          {
              for (int fifth = 0; fifth < pollss[fourth].length; fifth = fifth + 1) 
              {
                  System.out.print(pollss[fourth][fifth]+"");
              }
              System.out.println();
          }
          System.out.println();

          String answer2;
          answer2 = myObj.nextLine();
          System.out.println("답)"+ answer2);

           String[][] pollsss = {
         {"3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?"},
              { "(1)전혀 아니다.","(2)아니다.", "(3)그렇다.", "(4)매우그렇다."}
           };

           for (int sixth = 0; sixth < pollsss.length; sixth = sixth + 1) 
           {
               for (int seventh = 0; seventh < pollsss[sixth].length; seventh= seventh + 1) 
               {
                   System.out.print(pollsss[sixth][seventh]+"");
               }
               System.out.println();
           }
           System.out.println();

           String answer3;
           answer3 = myObj.nextLine();
           System.out.println("답)"+ answer3);

           String[][] pollssss = {
          {"4. 강의 진행 속도는 적절하였는가?"},
              { "(1)전혀 아니다.","(2)아니다.", "(3)그렇다.", "(4)매우그렇다."}
           };

           for (int eighth = 0; eighth < pollssss.length; eighth = eighth+ 1) 
           {
               for (int ninth = 0; ninth < pollssss[eighth].length; ninth = ninth + 1) 
               {
                   System.out.print(pollssss[eighth][ninth]+"");
               }
               System.out.println();

               String answer4;
               answer4 = myObj.nextLine();
               System.out.println("답)"+ answer4);
    
           }
           System.out.println();
           System.out.println("-------------------설문 종료-------------------");
           System.out.println();
           System.out.println("-------------------설문 결과-------------------");
         }

}




