public class nested {
    public static void main(String[] args){
//      TO print:
//        0 1 2 3 4
//        0 1 2 3 4
//        0 1 2 3 4
//        0 1 2 3 4
//        0 1 2 3 4
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
//        To print:
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
//        To print:
//        A
//        AB
//        ABC
//        ABCD
//        ABCDE
//        ABCDEF
        for(int i=65;i<=(65+5);i++){
            for(int j=65;j<=i;j++){

                System.out.print((char)j);
            }
            System.out.println();
        }

//        Using break and continue statements
        for (int i=1;i<=10;i++){
            if(i==2){
                continue;
            }
            if(i>7){
                break;
            }
            System.out.println("Value is: "+i);
        }



    }
}
