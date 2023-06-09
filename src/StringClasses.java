public class StringClasses {
    public static void main(String[] args) {
        try {
            String name = "Angela Song";
            name.equalsIgnoreCase("Angela Song");//true
            name.equalsIgnoreCase("Angela So");//false
            
            String name_second = new String("Friend Jane !"); // String()은 생성자 
            name_second.equals("Friend Jane !");//true
            name_second.length(); //13
            // name_second.replaceAll("e", "a");//"Friand Jana !"
            name_second = name_second.replaceAll("e", "a");//"Friand Jana !"
            // name_second.split(" ");//String[3]@250    
            String[]arrays = name_second.split(" ");
            //name_second.substring(3, 12)
            String name_substring = name_second.substring(3, 11);//"and Jana"

            System.out.println();
           
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}

//String name_second = new String("Friend Jane !");
            //name_second.equals("Friend Jane !");    //true
            //name_second.length();       // 13
            //name_second = name_second.replaceAll("e", "a"); //"Friand Jana !"
            //String[] arrays = name_second.split(" ");
           // String name_substring = name_second.substring(3, 11);   //"and Jana"
           // System.out.println();