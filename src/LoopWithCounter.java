public record LoopWithCounter() {
    public static void main(String[] args) {
        int repeat = 5;
        int num = 1;
        int count = 1;
        
        while (count <= repeat) {
            System.out.println(num);
            count = count + 1; 
            num = num +1; 
            
        }
       
    //return 0;

    }
}
