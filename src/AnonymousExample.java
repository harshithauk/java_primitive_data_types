class Anonymous{
    public void show(){
        System.out.println("In Anonymous show");
    }
}
class B_Anonymous extends Anonymous{
    public void show(){
        System.out.println("Im the best");
    }
}
public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous obj = new Anonymous(){
                            public void show(){
                                System.out.println("Im the best");
                            }
                        };
        obj.show();

    }
}
