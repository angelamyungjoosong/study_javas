import java.util.HashMap;

public class ClassHashMaps {
    public static void main(String[] args) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("first", 1); // null 값넣음
            hashMap.put("second", 2); // null
            hashMap.put("third", 3); // null 
            hashMap.get("third"); //Integer@34 "3"순번이 아니라 키로 value를 가져온다 Integer@34 "3"
            hashMap.size(); //3 사이즈 확인 
            hashMap.put("second",5);//Integer@32 "2" 값 변경하기 
            hashMap.remove("second"); // key를 사용해서 제거하는 방법 
            hashMap.keySet();//HashMap$KeySet@505 size=2,  key값 따로가져오는 방법 / 리스트를 돌려서 그 안의 값을 모두 뽑아내고 싶을때 사용 
            hashMap.values(); // HashMap$Values@509 size=2, value값 따로 가져오는  방법 
            //list 안에 hashmap넣을 수있고 hashmap안에 list 넣을 수 있고 등등 (class니까)
            hashMap.clear(); // (void) 초기화 
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
