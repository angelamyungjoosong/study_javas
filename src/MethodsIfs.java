import java.util.Scanner;//class
public class MethodsIfs 
{public String statement(int time) {
    
    String statement="";
   
    try {
       
if (time < 12) {
statement= "오전입니다";
} else if (time < 18) {
    statement="오후입니다";
    } else if (time <25) {
        statement="밤입니다";
        }

    } catch (Exception e) {
        // TODO: handle exception
    }
    return statement;
}  

public static void main(String[] args) {
try {int time = 0;
    Scanner myObj= new Scanner(System.in);

    while (time <25){
        MethodsIfs methodifs = new MethodsIfs();
    time= myObj.nextInt();
    String returnresult = methodifs.statement(time);
    System.out.println(returnresult);}

} catch (Exception e) {
    // TODO: handle exception
}
//return 0;
}

}


// public class MethodsIfs 
// {public String statement(int time) {
//     time = 15;
//     String statement="";
   
//     try {
       
// if (time < 12) {
// statement= "오전입니다";
// } else if (time < 18) {
//     statement="오후입니다";
//     } else {
//         statement="밤입니다";
//         }

//     } catch (Exception e) {
//         // TODO: handle exception
//     }
//     return statement;
// }  

// public static void main(String[] args) {
// try {int time = 15;
    
//     MethodsIfs methodifs = new MethodsIfs();
//     String returnresult = methodifs.statement(time);
//     System.out.println(returnresult);

// } catch (Exception e) {
//     // TODO: handle exception
// }
// //return 0;
// }

// }
