import java.sql.*;

public class ConnectDBs {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
        // - User/password와 접속 IP:port 접속
        String url = "jdbc:mysql://localhost:3306/db_cars";
        String user = "root";
        String password = "!yojulab*";
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n"); //데이터베이스 더블클릭까지 이루어지는 것 
                
            // - query Edit
            Statement statement = connection.createStatement(); //해당하는 쿼리문 동작할 수 있게 
            String query = "SELECT * FROM factorys";
            ResultSet resultSet = statement.executeQuery(query);// 결과값 받아냄 , 결과값이 테이블로 넘어온다 
            while(resultSet.next()){
                
                  System.out.println(resultSet.getString("COMPANY_ID")
                  + resultSet.getString("COMPANY"));
            }

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}




