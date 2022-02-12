public class ifelse {
    public static void main(String[] args){
        int n = 7;
        System.out.println("Simple If");
        if(n%2 == 0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }

        System.out.println("If else if");
        if(n == 0){
            System.out.println("Do nothing");
        }
        else if(n%2==0){
                System.out.println("Odd Number");
        }
        else {
                System.out.println("Odd Number");
        }

        System.out.println("Nested If");
        n=0;
        if(n == 0){
            System.out.println("Do nothing");
        }
        else {
            if(n%2==0){
                System.out.println("Odd Number");
            }
            else {
                System.out.println("Odd Number");
            }

        }

        System.out.println("Terneray Operator");
        int result = (8>4)?1:0;
        System.out.println("Result= "+result);

    }
}
