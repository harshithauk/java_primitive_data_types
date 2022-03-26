abstract class Write{
    public abstract void write();
}
class Pen extends Writer {
    public void write(){
        System.out.println("Im a Pen");
    }
}
class Pencil extends Writer {

    public void write() {
        System.out.println("Im a Pencil");
    }
}
class Kit{
    public void doSomething(Writer p){
        p.write();
    }
}

public class AbstractDemo {
    public static void main(String[] args){
        Kit kit = new Kit();
        Writer p = new Pen();
        Writer pc = new Pencil();
        kit.doSomething(p);
    }
}
