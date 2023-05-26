import java.util.Scanner;

public class Breaks {
    // 콜센터 업무 안내 작성
    public static void main(String[] args) {
        // Try Catch문 사용
        try {
            Scanner myObj = new Scanner(System.in); // Create a Scanner object
            String answer="";
            //변수는 앞쪽에서 선언하기 위해 끌어옴
            System.out.println("안내입니다.");
            //while문 계속 트루 나오게 
            boolean loops =true;
            while (loops) {
            System.out.println("1-대출, 2-예금, 3~9-종료");
            
            System.out.println("입력하세요");
            answer = myObj.nextLine(); // 문자로 스캐너 선언하고 사용 
            // 분기니까 if문 , 분기 세번이니까 else if
            if (answer.equals ("1"))
             {
                System.out.println("대출 업무 입니다");
            } else if (answer.equals("2")) {
                System.out.println("예금 업무 입니다");
            } else {
                System.out.println("업무가 종료됩니다");
                break;
            }
        }
        } catch (Exception e) {
            System.out.println();
        } finally {
            System.out.println();
        }
        System.out.println();
        // return 0;
    }

}
