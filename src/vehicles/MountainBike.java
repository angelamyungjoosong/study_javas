package vehicles;


//Bicycle을 상속받아 

public class MountainBike extends Bicycle {
    int seatHeight;
    public MountainBike(){ // 생성자 
     
    }
    public MountainBike(int price, String color, int seatHeight){
        this.seatHeight = seatHeight;
        super.price = price;
        super.color = color; //this써도 상관없다 
    }

     public String toString(){
        String str = "price :" + super.price + ", color :" + super.color + ", seatHeight :" 
        + this.seatHeight;
        return str;
}
        // public String super toString(){}
}

// 슈퍼 - 재정의 대신 자기가 상속받은 녀석을 그대로 사용하겠다 
// 자기 클래스에서 사용하는 거 this  내부변수 
// 자기가 상속받은 변수나 매소드 사용하는 거 super (내가 재정의하지 않은 경우)

//상속 받았어도 마지막 단계에서도 똑같은 메소드를 재정의한다면 맨마지막 것이 적용이 된다 
// method는 상속 받았을때 this안써도 내가 새로만든  header에 들어오기 때문에 그대로 사용 가능
// 이미 재정의한 경우에는 super쓰고 재정의하지 않은 경우에는 그냥 this써도 됨 
