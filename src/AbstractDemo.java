abstract class Write{
    public abstract void write();
}
class Pen extends Write {
    public void write(){
        System.out.println("Im a Pen");
    }
}
class Pencil extends Write {

    public void write() {
        System.out.println("Im a Pencil");
    }
}
class Kit{
    public void doSomething(Write p){
        p.write();
    }
}

public class AbstractDemo {
    public static void main(String[] args){
        Kit kit = new Kit();
        Write p = new Pen();
        Write pc = new Pencil();
        kit.doSomething(p);
    }
}
