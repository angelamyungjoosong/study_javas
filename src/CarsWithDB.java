import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;
import commons.Commons;

public class CarsWithDB {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
            String query = "";

            // 작업 키 입력
            Scanner scanner = new Scanner(System.in);

            String workKey = "P";
            while (!workKey.equals("E")) {
                System.out.print("선택입력 :");
                workKey = scanner.nextLine();
                // e일때, p일때, 둘다 아닐때

                if (workKey.equals("O")) {
                    // - 차 이름 명단
                    System.out.println("- 차 이름 명단");
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFOR.CAR_NAME\n" + //
                            "\t , T_CAR_INFOR.CAR_INFOR_ID  " + //
                            "FROM (factorys AS T_FAC\n" + //
                            "\tinner JOIN car_infors AS T_CAR_INFOR\n" + //
                            "    ON T_FAC.COMPANY_ID = T_CAR_INFOR.COMPANY_ID)";
                    ResultSet resultSet = statement.executeQuery(query); //에디터 창에서 실행 시켜서 결과값 던져주기 
                    //결과값 받아내는 것이 resultset 
                    int number = 1;
                    Statement statement2 = connection.createStatement(); // 에디터 창이 어느데이터 베이스에 연결되었는지 알수 있게 하게 위해
                    ResultSet resultSet2;
                    String query2; // while문 안에서 사용할 것을 밖에서 선언해준것임
                    HashMap<String, String> carNumberMap = new HashMap<>();
                    while (resultSet.next()) {
                        System.out.print(number + "." + resultSet.getString("COMPANY") + "-" +
                                resultSet.getString("CAR_NAME") + ":");
                        String carInforId = resultSet.getString("CAR_INFOR_ID"); // 내에서 변수 2번사용하니까
                        carNumberMap.put(String.valueOf(number), carInforId);
                        // number를 string으로 바꿔주는 function. while문에 key/value 값이 담길 것임 1-pk, 2-pk, 3-pk,
                        // ... i

                        query2 = "SELECT T_OPT_INFO.OPTION_NAME\n" + //
                                "FROM option_infors AS T_OPT_INFO\n" + //
                                "\tinner join `options` AS T_OPTS\n" + //
                                "    On T_OPT_INFO.OPTION_INFOR_ID = T_OPTS.OPTION_INFOR_ID\n" + //
                                " " + //
                                "   AND T_OPTS.CAR_INFOR_ID = '" + resultSet.getString("CAR_INFOR_ID") + "'";
                        resultSet2 = statement2.executeQuery(query2);

                        while (resultSet2.next()) {
                            System.out.print(resultSet2.getString("OPTION_NAME") + ",");
                        }
                        number = number + 1;
                        System.out.println(); // 줄바꿈

                        // 옵션 추가 방법 (차명 번호 입력: ...차명 번호는 허상, primary key) Hashmap (key-value)사용
                        // 1-어떤primarykey, 2-어떤primarykey인지 알아야 insert 가능
                        // 어떤걸 추가할거야하고 그 번호를 넣어...레코드가 생겨..옵션 추가됨

                    }
                    // 새로운 에디터창에서 가져온 걸 while문에서 루핑 돌면서 프린트해줌
                    // 차명 번호 입력
                    System.out.print("- 차 이름 명단 :");
                    String CarNumber = scanner.nextLine();
                    // System.out.println("차명 PK : " + carNumberMap.get(CarNumber));
                    // 번호에 따라 primary 키 만들어놓아야함 key-value로 while문 들어가기 전에 해쉬맵 만들어

                    System.out.println(" - 선택 가능 옵션들");
                    query = "SELECT OPTION_INFOR_ID, OPTION_NAME\n" + //
                            "FROM option_infors;";
                    resultSet = statement.executeQuery(query);
                    number = 1;
                    HashMap<String, String> carOptionInfor = new HashMap<>();
                    while (resultSet.next()) {
                        System.out.print(number + "." + resultSet.getString("OPTION_NAME") + ",");
                        carOptionInfor.put(String.valueOf(number), resultSet.getString("OPTION_INFOR_ID"));
                        number = number + 1;
                    }
                    System.out.println(); // 옵션 선택할 수 있는 번호를 가져올 수 있다

                    // 추가옵션번호
                    System.out.print("- 추가 옵션 선택: ");
                    String optionNumber = scanner.nextLine();
                    // 두개 가져와서 레코드 만들기 hashmap에 정보 넣어서 key로 가져옴
                    System.out.println(carNumberMap.get(CarNumber) + "," + carOptionInfor.get(optionNumber));
                    String carPK = carNumberMap.get(CarNumber);
                    String optionPK = carOptionInfor.get(optionNumber);
                    // delete 옵션
                    query = "DELETE FROM `OPTION`" + //

                            "WHERE CAR_INFOR_ID = '" + carPK + "' AND OPTION_INFOR_ID = '" + optionPK + "'";
                    int count = statement.executeUpdate(query);

                    // insert옵션
                    Commons commons = new Commons();
                    String optionId = commons.generateUUID();
                

                    query = "INSERT INTO `OPTIONS`" +
                            "(OPTION_ID, CAR_INFOR_ID, OPTION_INFOR_ID)" +
                            "value" +
                            "('"+optionId+"', '" +carPK+ "', '" +optionPK+ "')";
                        count = statement.executeUpdate(query);

                        System.out.println();

                } else if (workKey.equals("S")) {
                    System.out.println("- 통계 시작 -");
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFOR.CAR_NAME, COUNT(*) AS CNT\n" + //
                            "FROM (factorys AS T_FAC\n" + //
                            "\tinner JOIN car_infors AS T_CAR_INFOR\n" + //
                            "    ON T_FAC.COMPANY_ID = T_CAR_INFOR.COMPANY_ID) " + //
                            "    inner JOIN `options` AS T_OPTS\n" + //
                            "    ON T_CAR_INFOR.CAR_INFOR_ID = T_OPTS.CAR_INFOR_ID\n" + //
                            "    GROUP BY T_FAC.COMPANY_ID, T_CAR_INFOR.CAR_INFOR_ID   ";
                    // statement (edit창)이 하나 열린 상태 --> 이제 창(Statement)에서 쿼리문을 실행을 하면 됨
                    ResultSet resultSet = statement.executeQuery(query); // select문은 테이블로 뱉어냄
                    // 결과값 낼 때, next fuction사용하면 계속 다음 레코드로 간다.

                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("COMPANY") + "," +
                                resultSet.getString("CAR_NAME") + "," +
                                resultSet.getInt("CNT"));
                    }
                } else {
                    System.out.println("--- 작업 키 확인: 입력한 값 : " + workKey);

                }
            }
            System.out.println("----작업종료----");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}
