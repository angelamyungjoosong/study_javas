import java.util.HashMap;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

        HashMap <Integer, String> answer = new HashMap<>();
        Statement statement = connection.createStatement();
        String query = "";

        // answer.put("1","a");
        // answer.put("2","b");
        // answer.put("1", "d"); //key값은 중복이안되고 덮어써짐 
        // answer.put("3", "c");
      
        // String A = answer.get("1");
        // System.out.print(A);

        // System.out.print(answer.get("3") + answer.get("1"));
        
        // int A = 1; 
        // if  ( A <= 10) {
        // answer.put(A,"a");
        // }
        // System.out.print(answer.get(3));

        //int n = 1;
        //while (n < 11) {
        //answer.put(n, "a");
        //n=n+1;}
        //System.out.print(answer);

        //for (int i = 0 ; i <10 ; i= i+1)
        //{answer.put(i+1, "a");};
        //System.out.print(answer);

        answer.put(1, "A-01");
        answer.put(2, "A-02");
        answer.put(3, "A-03");
      
    
        Scanner scanner = new Scanner(System.in);
        HashMap <String, String> questionanswer = new HashMap<>();
        int a=scanner.nextInt();
        questionanswer.put("Q-01", answer.get(a));
        int b=scanner.nextInt();
        questionanswer.put("Q-02", answer.get(b));
        int c=scanner.nextInt();
        questionanswer.put("Q-03", answer.get(c));
        System.out.print(questionanswer);
        
        query = "INSERT into statistics
        (QUESTIONS_ID, CHOICE_ID)
            values 
            ('Q-01', "answer.get(a)"),
            ('Q-02', "answer.get(b)"),
            ('Q-03', "answer.get(c)");"
    

    }

   }
