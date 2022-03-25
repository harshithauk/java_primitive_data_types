final class Z {
    final int DAY ;
    public Z(){
        DAY=10;
    }
}
class Z1{
    public final void show(){
        System.out.println("in show");
    }
}
//class Z2 extends Z1{
//    public void show(){
//        System.out.println("in Z2 show");
//    }
//}
public class FinalDemo {
    public static void main(String[] args){
        Z obj = new Z();
        System.out.println(obj.i);
    }
}
