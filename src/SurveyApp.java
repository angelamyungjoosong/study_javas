import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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

            System.out.println("--- 통계 ---");
            // -- 총 설문자 : 3명
            String queryB = "SELECT COUNT(*) AS CNT\n" + //
                    "FROM (\n" + //
                    "\tSELECT RESPONDENTS_ID, COUNT(*) AS CNT\n" + //
                    "\tFROM statistics\n" + //
                    "\tGROUP BY RESPONDENTS_ID\n" + //
                    "    ) AS T_STATIC"; //
            ResultSet resultSet = statement.executeQuery(queryB);
            while (resultSet.next()) {
                System.out.println("-- 총 설문자 : "+resultSet.getString("CNT"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
