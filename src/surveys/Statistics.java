package surveys;

import java.sql.ResultSet;
import java.sql.Statement;

public class Statistics {
    public int getRespondents(Statement statemnet) {
        try {
            System.out.println("--- 통계 ---");
            // -- 총 설문자 : 3명
            String query = "SELECT COUNT(*) AS CNT\n" + //
                    "FROM (\n" + //
                    "\tSELECT RESPONDENTS_ID, COUNT(*) AS CNT\n" + //
                    "\tFROM statistics\n" + //
                    "\tGROUP BY RESPONDENTS_ID\n" + //
                    "    ) AS T_STATIC"; //
            ResultSet resultSet = statemnet.executeQuery(query);
            while (resultSet.next()) {
                System.out.println("-- 총 설문자 : "+resultSet.getString("CNT"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
   }
}   

