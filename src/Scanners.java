 import java.util.Scanner;//class


 public class Scanners {public static void main(String[] args) {
   Scanner myObj= new Scanner(System.in); //Scanner를 인스턴스화+데이터타입// Create a Scanner object
//     System.out.println("Enter username");

//     String userName = myObj.nextLine();  // Read user input
//     System.out.println("Username is: " + userName);  // Output user input

    int First = 0;
    int Second = 0;
   

   First = myObj.nextInt(); 
   Second = myObj.nextInt();


   System.out.println(First + Second);
   myObj.close();

    //return 0;
}
    
}
