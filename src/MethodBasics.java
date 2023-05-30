
public class MethodBasics {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    // x에 +1
    public int F(int x) // x = 0
    {
        int result = x + 1;
        return result;// 밖으로 던져버려 
    }
    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            // y = x + 1; // 변수에 + 1
            // y = F(x);
            MethodBasics methodBasics = new MethodBasics();
            y = methodBasics.F(x);
            //호출 
            y = y + 1; // 변수에 + 1
            MethodBasics methodBasics_first = new MethodBasics();
            y = methodBasics_first.F(y);  // F(0) x=y=6이라는 값이 호출해서 넘어가 
            y = methodBasics_first.F(y);  // F(0)

        } catch (Exception e) {
            // TODO: handle exception // 해당영역의 살아남은 변수 string이 보임
        }
        System.out.println();
        // return 0;
    }
}



// public class MethodBasics {
//     // <access_modifier> <return_data_type> <metod_name> (list_of_parameters)
//     // {
//     //   //body
//     // }
//     // x에 +1
//     public int F(int x) // x=4 call by value 
//      {
//          int result = x + 1;
//          return result;
//      }


//     public static void main(String[] args) {

//         try {
//             int x = 4;
//             int y = 0;

//             // y = x + 1; //변수에 + 1]
//             MethodBasics methodBasics = new MethodBasics(); //앞에 있는 methodBasics을 class를 변수에 넣은 상황, 이것의 data type은 class. class 자체가 기능을 묶어놓은 data type이 될 수 있다. clone된 이건 main과 F fuction가지고 있다  
//             y = methodBasics. F(x);// methodBasics의 clone으로써 이 안의 fuction 모든 걸 사용할 수 있다. class내의 fuction. return을 y값에 받아냈기에 y=을 씀.  
            
            


//             // y = y + 1; 변수에 + 1 // 인스턴스화해서 값을 넣어서 같은 값 뱉어내게 해보기 
//            y = methodBasics. F(x) + 1 ;

//            MethodBasics methodBasics_first = new MethodBasics();
//            y = methodBasics_first.F(y); //call by value, y변수 안의 값이 날아가서 호출해서 X+1되어돌아옴
//            y = methodBasics_first.F(0); // 위와 같은 것 


//         } catch (Exception e) {
//             // TODO: handle exception
//         }
//         System.out.println();
//         // return 0;
//     }
// }


