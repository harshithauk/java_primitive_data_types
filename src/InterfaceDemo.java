interface Writer {
   void write();
}
class Pen1 implements Writer {
    public void write(){
        System.out.println("Im a Pen");
    }
}
class Pencil1 implements Writer {

    public void write() {
        System.out.println("Im a Pencil");
    }
}
class Kit1{
    public void doSomething(Writer p){
        p.write();
    }
}

public class InterfaceDemo {
    public static void main(String[] args){
        Kit1 kit = new Kit1();
        Writer p = new Pen1();
        Writer pc = new Pencil1();
        kit.doSomething(p);
    }
}
