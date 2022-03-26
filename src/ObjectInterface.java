interface Abc{
    void show();
}
public class ObjectInterface {
    public static void main(String[] args) {
        Abc obj = new Abc() {
            @Override
            public void show() {
                System.out.println("I'm the best");
            }
        };
        obj.show();
    }
}
