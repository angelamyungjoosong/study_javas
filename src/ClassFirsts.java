public class ClassFirsts {
    public int second = 0;
    public ClassFirsts(){
        System.out.println();
    } //class의 clone으로 리턴
    public ClassFirsts(int first){
        this.second = first; //해당클래스 내의 변수를 해당 fuction 밖에서 가져옴
        System.out.println(first);
    }//변수의 초기값 셋팅
    public int getSecond(){
        return this.second;
    }
}

