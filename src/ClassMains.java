import cases.ClassSeconds;//package cases가져오려면 필요하다 

public class ClassMains {public static void main(String[] args) {
    try {
        ClassFirsts classFirsts = new ClassFirsts(); //no parameter/ class만 리턴 
        ClassFirsts classFirstsWithVar = new ClassFirsts(5); //one parameter/ 변수초기화를 시키는 
        int second = classFirstsWithVar.getSecond(); //변수를 바깥에 있는경우는 가져올수있음
        
        ClassSeconds classSeconds = new ClassSeconds(6);
        
        System.out.println();
    } catch (Exception e) {
        // TODO: handle exception
    }
    //return 0;
}
    
}
