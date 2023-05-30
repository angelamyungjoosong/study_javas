public class MethodsIfs 
{public String statement(int time) {
    time = 15;
    String statement="";
   
    try {
       
if (time < 12) {
System.out.println("오전입니다");
} else if (time < 18) {
    System.out.println("오후입니다");
    } else {
        System.out.println("밤입니다");
        }

    } catch (Exception e) {
        // TODO: handle exception
    }
    return statement;
}  

public static void main(String[] args) {
try {int time = 15;
    
    MethodsIfs methodifs = new MethodsIfs();
    String returnresult = methodifs.statement(time);
    System.out.println(returnresult);

} catch (Exception e) {
    // TODO: handle exception
}
//return 0;
}

}
