public class MethodsSwitches {

        //     // <access_modifier> <return_type> <method_name>( list_of_parameters)
        //     // {
        //     // //body
        //     // }
        public String today(int day){

            String str="";
            try {
                switch (day) { //넣는 값이 day고 나오는 값이 str
                    case 1:
                        str = "Monday";
                        break;
                    case 2:
                        str = "Tuesday";
                        break;
                    case 3:
                        str = "Wednesday";
                        break;
                    case 4:
                        str = "Thursday";
                        break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
            return str;
        }



    public static void main(String[] args) {
        try {
            int day = 4; // 1-4 가능
            String str = "";

            MethodsSwitches methodSwitches = new MethodsSwitches();//데이터타입,변수, 인스턴스화;
            String returnResult = methodSwitches.today(day);
            System.out.println(returnResult);

        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;

    }
}
