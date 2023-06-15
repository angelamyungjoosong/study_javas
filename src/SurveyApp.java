import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import surveys.Statistics;

public class SurveyApp {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_survey";
            String user = "root";
            String password = "!yojulab";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();

             System.out.println("--- 설문자 가능 명단 ---");
            // -- 설문자 가능 명단(가입 완료)
            // -- 1. 홍길동, 2.장길산, 3.신사임당, ...
            String query = "SELECT *\n" + //
                    "FROM respondents\n" + //
                    ";";
            ResultSet resultSet = statement.executeQuery(query);
            int number = 1;
            while (resultSet.next()) {
                System.out.print(number + "." + 
                resultSet.getString("respondents") + ",");
                number = number + 1;
            }
            System.out.println();

            // -- 설문 시작
            // -- 참조 : poll contents example
            // -- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
            // -- 2. 강의의 내용은 체계적이고 성의있게 구성되었는가?
            // -- 문항
            System.out.println("-- 설문 시작");
            query = "SELECT *\n" + //
                    "FROM questions\n" + //
                    ";";
            resultSet = statement.executeQuery(query);
            number = 1;
            Statement statement_second = connection.createStatement();

            while (resultSet.next()) {
                System.out.println(number + "." + 
                resultSet.getString("questions") + ",");
                query = "SELECT T_CHO.CHOICE_ID, T_CHO.CHOICE\n" + //
                        "FROM question_choice AS T_QUES\n" + //
                        "\tINNER JOIN choice AS T_CHO\n" + //
                        "    ON T_QUES.CHOICE_ID = T_CHO.CHOICE_ID\n" + //
                        "\tAND QUESTIONS_ID = 'Q1'\n" + //
                        ";";
            ResultSet resultSet_second = statement_second.executeQuery(query);
            int number_second = 1;
            while (resultSet_second.next()) {
                System.out.print(number_second + "." + 
                resultSet_second.getString("CHOICE") + ",");
                number_second = number_second + 1;
            }
                System.out.println();
                number = number + 1;
            }
            System.out.println();



            //통계 - 총 설문자 표시 
            Statistics statistics = new Statistics();
            statistics.getRespondents
            (statement);
          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
