// public class Methods {
//     // <access_modifier> <return_type> <method_name>( list_of_parameters)
//     // {
//     // //body
//     // }

//     public int minus(int first, int second) {
//         int result = 0;
//         try {
//             result = first - second;
//         } catch (Exception e) {
//             // TODO: handle exception
//         }
//         return result;
//     }

//     public int add(int first, int second) {

//         int result = 0;
//         try {
//             result = first + second;

//         } catch (Exception e) {
//             // TODO: handle exception
//         }
//         return result;

//     }
//         public static int main(int first, int second) {
//             //인스턴스 1회
//             //초기 값은 2를 넘지 않음 
//             //main 결과값은 17
//             int result = 0;
            
//             try {first = 2;
//                 second = 1;
//                 Methods methods = new Methods();
//                 result = methods.add(first, first);
//                 result = methods.add(first, first);
//                 result = methods.add(first, first);
//                 result = methods.add(first, second);
    
//             } catch (Exception e) {
//                 // TODO: handle exception
//             }
           
//             return result;
            
//     }
// }

public class Methods {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    public int minus(int first, int second){
        int result = 0;
        try {
           result = first - second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }
    public int add(int first, int second){
        int result = 0;
        try {
            result = first + second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result ;
    }
    
    public int main(int first, int second) {
        // - 인스턴스는 1회
        // - 초기 값은 2를 넘지 않음.
        // - main 결과값은 17
        int result = 0;
            try {first = 2;
                second = 1;
                Methods methods = new Methods();
                result = methods.add(first, first);
                result = methods.add(first, first);
                result = methods.add(first, first);
                result = methods.add(first, second);
    
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }
}