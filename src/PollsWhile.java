import java.util.Scanner;

public class PollsWhile{
    public static void main(String[] args) {
        try {

            Scanner myObj = new Scanner(System.in);
            String answer = "";

          
            System.out.println("선택에 따라 안내글을 보여드립니다.");
            System.out.println("----- 작동 key -----");
            String[] poll = { "(E)xit : 종료", "(P)oll : 설문 시작", "(S)tatistic : 설문 통계" };
            for (int number = 0; number < poll.length; number = number + 1) {
                System.out.println(poll[number]);
            }

            boolean loops =true;
            while (loops) {System.out.println();
            System.out.print("선택 입력 : ");
            answer = myObj.nextLine();
            if (answer.equals("P")) {
                System.out.println("-----설문 시작-----");
            } else if (answer.equals("Poll")) {
                System.out.println("-----설문 시작-----");
            } else if (answer.equals("S")) {
                System.out.println("-----설문 통계-----");
            } else if (answer.equals("Statistic")) {
                System.out.println("-----설문 통계-----");
            } else if (answer.equals("E")) {
                System.out.println("-----설문 종료-----");break;
            } else if (answer.equals("Exit")) {
                System.out.println("-----설문 종료-----");break;
            } else {System.out.println("선택에 따라 안내글을 보여드립니다.");
            System.out.println("----- 작동 key -----");
            String[] polls = { "(E)xit : 종료", "(P)oll : 설문 시작", "(S)tatistic : 설문 통계" };
            for (int numberr = 0; numberr < polls.length; numberr = numberr + 1) {
                System.out.println(polls[numberr]);
            }
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
