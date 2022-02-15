//class Student{
//    int rollno;
//    String name;
//}
public class ArrayDemo {

    public static void main(String[] args){

//        1D Array
        int[] nums = new int[4];
        nums[3]=10;
        System.out.println(nums[3]);
        for(int i=0;i<4;i++){
            nums[i] = i;
            System.out.println(nums[i]);
        }



//        2D Array
        System.out.println("2D Array");
        int d[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(d[0][1]);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                System.out.print(d[i][j]);
            }
            System.out.println();
        }

        //        Jagged Array
        System.out.println("Jagged Array");
        int x[][] = {
                {1,2,3},
                {4,5},
                {7,8,9}
        };

        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }

//        Enhanced for loop
        int a[] = {1,2,3,4};
        for (int k:a){
            System.out.println(k);
        }


//  Enhanced for loop for 2D and jagged array
        for (int k[]:x){
            for(int l:k){
                System.out.print(l);
            }
            System.out.println();
        }

    }
}
