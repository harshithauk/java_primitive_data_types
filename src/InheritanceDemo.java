class Calculator{                   //Super class
    public int add(int i,int j){
        return i+j;
    }
}
class CalcAdv extends Calculator    //Sub Class
{
    public int sub(int i,int j){
        return i-j;
    }
}
class CalcVeryAdv extends CalcAdv   //Sub Class
{
    public int mul(int i,int j){
        return i*j;
    }
}
public class InheritanceDemo {
    public static void main(String[] args){
        CalcVeryAdv c1 = new CalcVeryAdv();
        int result1 = c1.add(5,4);
        int result2 = c1.sub(5,4);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(c1.mul(5,4));
    }
}
