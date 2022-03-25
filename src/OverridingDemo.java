class A1{
    public void show(){
        System.out.println("In A");
    }
}
class B1 extends A1{
    @Override
    public void show(){
        System.out.println("In B");
    }
}

public class OverridingDemo {
    public static void main(String[] args){
        B1 obj1 = new B1();
        obj1.show();

    }
}
