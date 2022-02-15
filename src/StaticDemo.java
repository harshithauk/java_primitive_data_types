class Emp{
    int eid;
    int salary;
    static String ceo;

    static {    //when you load a class
        ceo = "Larry";
        System.out.println("in static");
    }
    public Emp(){ // when you create a object
        eid =1;
        salary=1000;
        System.out.println("in constructor");
    }
    public void show(){
        System.out.println(eid + ": "+salary+": "+ceo);
    }
}
public class StaticDemo {
    static int id = 5;
    public static void main(String[] args){
        Emp navin = new Emp();
        navin.eid = id;
        navin.salary = 50000;
//        navin.ceo = "mohit";

        Emp rahul = new Emp();
        rahul.eid = 101;
        rahul.salary = 7000;
        Emp.ceo = "sam";

        navin.show();
        rahul.show();
    }
}
