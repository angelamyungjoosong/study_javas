import java.sql.*;

public class ConnectDBs {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://192.168.0.31:3306/db_cars";
            String user = "yojulab";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM factorys";
            ResultSet resultSet = statement.executeQuery(query);// resultset은 재활용 가능
            while (resultSet.next()) {
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            }

            // SELECT COUNT(*) AS CNT FROM factorys;
            query = "SELECT COUNT(*) AS CNT FROM factorys";
            resultSet = statement.executeQuery(query);
            resultSet.next();
            int totalCount = 0;
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("CNT"));
                totalCount = resultSet.getInt("CNT");
            } // while문 없어도 작동하지만 그래도 통일성 있게 주는거임

            // INSERT INTO factorys
            // (COMPANY_ID, COMPANY)
            // VALUE
            // ('CAR-01', 'AUDI') ; 테이블 없이 아웃풋 나옴
            // 변수로 만들어주고 query에 넣는게 좋음. 쿼리 뒤에 띄어쓰기 한번씩 하기

            String companyId = "CAR-01";
            String company = "AUDI";
            query = "INSERT INTO factorys " +
                    "(COMPANY_ID, COMPANY) " +
                    " VALUE " +
                    "('" + companyId + "', '" + company + "') ";

            int count = statement.executeUpdate(query); // intert update delete는 executeupdate쓴다. select문 빼고.

            // update factorys
            // SET COMPANY = '패러리'
            // WHERE COMPANY_ID = 'CAR-01' ;

            companyId = "CAR-01";
            company = "패러리";

            query = "UPDATE factorys " +
                    "SET COMPANY = ('" + company + "') " +
                    "WHERE COMPANY_ID = ('" + companyId + "') ";

            count = statement.executeUpdate(query);

            //DELETE FROM factorys
            // WHERE COMPANY_ID = 'CAR-01'

             companyId = "CAR-01";


             query = "DELETE FROM factorys " +
                     "WHERE COMPANY_ID = ('" + companyId + "') ";

              count = statement.executeUpdate(query);

            System.out.println();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}

// // import java.sql.*;//패키지의이름. api확인하면 class가 있다.

// // public class ConnectDBs {
// // public static void main(String[] args) {
// // try {
// // // - MySQL workbench 실행 : JDBC
// // // - User/password와 접속 IP:port 접속
// // String url = "jdbc:mysql://127.0.0.1:3306/db_cars";// :// 보내는 규칠, 받는규칙 정해져있다.
// // 원격으로 db_cars로 연결하는 규칙 담아놓은 게 3306은 포트.
// // String password = "!yojulab*";
// // Connection connection = DriverManager.getConnection(url, user, password);
// // System.out.println("DB연결 성공\n"); //데이터베이스 더블클릭까지 이루어지는 것

// // // - query Edit
// // Statement statement = connection.createStatement(); //해당하는 쿼리문 동작할 수 있게
// // String query = "SELECT * FROM factorys"; //쿼리작성해서
// // ResultSet resultSet = statement.executeQuery(query);// 스테이트에서 실행 시킴. 테이블로
// // 넘어온다. 결과값 받아냄 (select문만 결과값 나온다).
// // while(resultSet.next()){

// // System.out.println(resultSet.getString("COMPANY_ID")
// // + resultSet.getString("COMPANY"));
// // }
// // // resultset은 list에 hashmap넣은 것과 같은 형태. next하면 값을 증가시키는 개념, 다음 next를 화살표가 저절로
// // 가리킨다.
// // System.out.println();

// // } catch (Exception e) {
// // // TODO: handle exception
// // System.out.println(e.getMessage()); //e.getMessage()는 오류 내용 아는 방법
// // }
// // System.out.println();
// // }

// //import java.sql.*;

// public class ConnectDBs {
//     public static void main(String[] args) {
//         try {
//             // - MySQL workbench 실행 : JDBC
//             // - User/password와 접속 IP:port 접속
//             String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
//             String user = "root";
//             String password = "!yojulab*";

//             Connection connection = DriverManager.getConnection(url, user, password);
//             System.out.println("DB연결 성공\n");

//             // - query Edit
//             Statement statement = connection.createStatement();
//             String query = "SELECT * FROM factorys";
//             ResultSet resultSet = statement.executeQuery(query);
//             while (resultSet.next()) {
//                 System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
//             }

//             // SELECT COUNT(*) AS CNT FROM factorys;
//             query = "SELECT COUNT(*) AS CNT FROM factorys";
//             resultSet = statement.executeQuery(query);
//             int totalCount = 0;
//             while (resultSet.next()) {
//                 System.out.println(resultSet.getInt("CNT"));
//                 totalCount = resultSet.getInt("CNT");
//             }

//             /*
//             INSERT INTO factorys
//             (COMPANY_ID, COMPANY) 
//             VALUE 
//             ('CAR-01', 'AUDI');
//             */
//             String companyId = "CAR-01";
//             String company = "AUDI" ;
//             query = "INSERT INTO factorys " +
//                     "(COMPANY_ID, COMPANY) " +
//                     " VALUE " +
//                     "('"+companyId+"', '"+company+"') ";
            
//             int count = statement.executeUpdate(query);
//             System.out.println();
//         } catch (Exception e) {
//             // TODO: handle exception
//             System.out.println(e.getMessage());
//         }
//         System.out.println();
//     }
// }
