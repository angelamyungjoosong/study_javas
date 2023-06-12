package cars;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//query문만 넘겨도 답변 나오도록 하는 class 만들기 

public class FactoryDMLs {
    public ResultSet selectStatements(Statement statement, String query) throws SQLException 
    {//resultset이 리턴값으로 받아서 쓴다 // 재활용할 변수 두개 타입과 같이 쓰기 
        ResultSet resultSet = statement.executeQuery(query);
        //function안에 동작할 것 그대로 넣기
        return resultSet;
        //리턴도 resultSet 된거임 
    }
// statement는 창...거기에 쿼리 써서 받는 값이 resultset 

//throw 나한테 문제 준 애한테 책임 넘겨버려 
public int insertStatements(Statement statement, String query) throws SQLException
{
    int count = statement.executeUpdate(query);
    return count;
}
}
//한 장소를 다른 목적으로 사용하는 느낌의 개념. 재활용하기 위해. 
//자원의 반납은 catch문 이후 , finally문은 에러가 나든, 나지 않든 작동이 된다. 
// 변수는 statement, query. 
//fuction은 statement.executeQuery
//이미 만들어진거 말고 우리가 스스로 만들어서 재활용해보자. 
// method모아둔 class만들고 method 만들자. 
// return이 숫자가 아니면 null로 넣어 

//메소드 사용을 위해 그 메소드가 들어가있는 클래스를 인스턴스화 시켜야함 
// FactoryDMLs factoryDMLs = new FactoryDMLs();
// ResultSet resultSet = factoryDMLs.selectStatements(statement,query);
//(statement,query) -> (a,b) 변수가 알리아스 되어서. 위에꺼가 호출되어서 저절로 값이 인수인계됨.치환되어서 사용됨. 
//호출되기 전과 호출되고 나서의 데이터타입 같다. 변수를 똑같이 써도 사실상 같은 애가 아니다. 
//parameter순서에 맞게 넘겨진다. 

