class Outer{
    int a;
    public void show(){
        System.out.println("In show");
    }
    class Inner{
        public void display(){
            System.out.println("In display");
        }
    }
}
public class InnerClassDemo {



    public static void main(String[] args){

        Outer obj = new Outer();
        obj.show();
//To use Inner class we need to make use of Outer class
//In order to create object of inner class we need to use object of outer class.
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();


    }
}
