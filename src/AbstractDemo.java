abstract class Human{
    public abstract void eat();
    public void walk(){

    }
}
class Man extends Human{ //concrete class

    public void eat(){

    }
}


public class AbstractDemo {
    Human obj = new Man();
}
