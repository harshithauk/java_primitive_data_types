public class while_loop {
//    while,do-while, for, for-each
    public static void main(String[] args){
        System.out.println("Using while loop");
        int i=0; //initialization
        while(i<5)//condition
        {
            System.out.println("Hello");
            i++; //increment
        }
        System.out.println("Using do-while loop");
        do
        {
            System.out.println("Hello");
            i++; //increment
        }while(i<3);
        System.out.println("Using for loop");
        for(i=0;i<5;i++){
            System.out.println("For loop");
        }
    }
}
