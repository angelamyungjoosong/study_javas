import java.util.ArrayList; //sub으로 사용하는 것 만들지않음. 이미 만들어져있기 때문. Java Project 밑에 포함된 상태이다. 

public class ClassArrayList {
    public static void main(String[] args) {
        try {
            
            ArrayList arrayList = new ArrayList(); //클래스 사용할때 인스턴스화 먼저 꼭 해야함/ 이건 순서대로 나열하는 기능 알고리즘 자료구조 
            int[] numbers = {1, 2, 3}; //버켓 사이즈 설정해놓으면 이 갯수 이상 넣을 수 없다.
            //차이점: 버켓 사이즈 설정할 필요 없기 때문에 ArrayList는 더 넣거나 덜 넣을 수 있다.class이기 때문에 function 통해 값 넣고 뺄 수 있다.  arrayList.add(1) ; true 안에들어간 int도 클래스다 
            
             arrayList.add(1);//true
             arrayList.add(2);//true
             arrayList.add(3);//true

             arrayList.size(); //3,갯수가 몇개 들어갔는지 확인/ 클래스 데이터 들어갈때 length대신 size를 사용함  
             // arrayList.get(2);
             // int val = arrayList.get(2)
             // 어떤 값을 어떻게 바꾼다 
             arrayList.set(1,5); //Integer@37 "2" 1번째 값을 5로 바꿈 
             arrayList.remove(0);// Integer@34 "1"//0번째 값을 없앤다 
             arrayList.clear(); //(void)재사용하고 싶어서 데이터를 다 삭제하고 싶을 때 사용 
            //처음부터 다 보고싶을 경우에는 for문을 사용한다 
            //데이터의 첫번째 열은 리스트로 담긴다 
            //class의 모든것들은 이 번호 자리에 들어갈 수 있다 -> HASHMAP 

            System.out.println();


        }catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
    
}
