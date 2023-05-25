
import java.util.Scanner;


public class PollsWithoutMethod1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String answer = "";
        String[] answers = {"",""};

        String[][]polls={{"1.문항"}, {"(1)답항","(2)답항","(3)답항"},{"2.문항"},{"(1)답항","(2)답항","(3)답항"}};
        int count = 0;
        for(int second=0; second <polls.length;second=second+2){
            System.out.println(polls[second][0]);
            System.out.print("답하기:");}
         
        for (int first=0; first < answers.length; first=first+1){System.out.print(answers[first]+",");}

         answers[count] = myObj.nextLine();
         count=count+1;
         System.out.println();

        }

        //return 0;

    }


// import java.util.Scanner;


// public class PollsWithoutMethod1 {
//     public static void main(String[] args) {
//         Scanner myObj = new Scanner(System.in);
//         String answer = "";
//         String[] answers = {"",""};

//         System.out.println("1. 문항");
//         System.out.println("(1)답항"+"(2)답항"+"(3)답항"+"(4)답항");
//         System.out.print("답하기");
//         answers[0] = myObj.nextLine();

//         System.out.println("2. 문항");
//         System.out.println("(1)답항"+"(2)답항"+"(3)답항"+"(4)답항");
//         answers[1] = myObj.nextLine();

//         for(int first = 0; first<answers.length; first=first+1){
//             System.out.print(answers[first]+",");
//         }
//         System.out.println();
//         //return 0;

//     }
// }

