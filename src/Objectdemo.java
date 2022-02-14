class Calc{
    int num1,num2,result;

//    constructor
    public Calc(){
        num1 = 10;
        num2 = 20;
    }
//    Constructor with parameters
    public Calc(int n1,int n2){
        num1 = n1;
        num2 = n2;
    }
    public void perform(){
        result = num1 + num2;
        System.out.println(result);
    }
}

public class Objectdemo {
    public static void main(String[] args){
        Calc obj = new Calc();

}
