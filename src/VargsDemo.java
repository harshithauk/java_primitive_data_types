class Calc1{
    public int add(int...n) //{1,2,3,4,5} Variable length Arguements
    {
        int sum=0;
        for(int i: n){
            sum +=i;

        }
        return  sum;
    }
}
public class VargsDemo {
    public static void main(String[] args){
        Calc1 obj = new Calc1();
        System.out.println(obj.add(1,2,3,4,5));
    }
}
