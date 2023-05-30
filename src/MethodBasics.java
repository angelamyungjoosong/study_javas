public class MethodBasics {
    // <access_modifier> <return_data_type> <metod_name> (list_of_parameters)
    // {
    //   //body
    // }
    // x에 +1
    public int F(int x)
     {
         int result = x + 1;
         return result;
     }

    public static void main(String[] args) {

        try {
            int x = 4;
            int y = 0;
            // y = x + 1; //변수에 + 1]
            MethodBasics methodBasics = new MethodBasics(); //앞에 있는 methodBasics을 class를 변수에 넣은 상황, 이것의 data type은 class. class 자체가 기능을 묶어놓은 data type이 될 수 있다. clone된 이건 main과 F fuction가지고 있다  
            y = methodBasics. F(x);// methodBasics의 clone으로써 이 안의 fuction 모든 걸 사용할 수 있다. class내의 fuction. return을 y값에 받아냈기에 y=을 씀.  
            
            // y = y + 1; 변수에 + 1 / 인스턴스화해서 값을 넣어서 같은 값 뱉어내게 해보기 
           y = methodBasics. F(x) + 1 ;
             

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}
