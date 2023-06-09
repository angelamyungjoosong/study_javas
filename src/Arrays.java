public class Arrays {
    public String[] initialArrays(){
        String[]carTypes = {"Volvo", "BMW", "Ford", "Mazda", "KIA"};
        return carTypes;
    }

    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        String[] cars = arrays.initialArrays();
        System.out.println(cars.length);
        for(int first = 0; first < cars.length; first = first + 1)
        {System.out.print(cars[first] + ",");
        }
       
        for (int number= 0; number < 4; number = number + 1) {
        System.out.println(cars[number]);
        }

        //return 0;

    //     String[][] numbers = {
    //             { "10", "20", "30", "40" },
    //             { "50", "60", "70" } };

    //     for (int second = 0; second < numbers.length; second = second + 1) 
    //     {
    //         for (int third = 0; third < numbers[second].length; third = third + 1) 
    //         {
    //             System.out.print(numbers[second][third] + ",");
    //         }
    //         System.out.println();
    //     }
    // }

    
    
}
}
